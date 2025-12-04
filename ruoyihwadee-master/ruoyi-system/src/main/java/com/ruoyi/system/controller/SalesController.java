package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Sales;
import com.ruoyi.system.service.ISalesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售情况Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/sales")
public class SalesController extends BaseController
{
    private String prefix = "system/sales";

    @Autowired
    private ISalesService salesService;

    @RequiresPermissions("system:sales:view")
    @GetMapping()
    public String sales()
    {
        return prefix + "/sales";
    }

    /**
     * 查询销售情况列表
     */
    @RequiresPermissions("system:sales:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Sales sales)
    {
        startPage();
        List<Sales> list = salesService.selectSalesList(sales);
        return getDataTable(list);
    }

    /**
     * 导出销售情况列表
     */
    @RequiresPermissions("system:sales:export")
    @Log(title = "销售情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Sales sales)
    {
        List<Sales> list = salesService.selectSalesList(sales);
        ExcelUtil<Sales> util = new ExcelUtil<Sales>(Sales.class);
        return util.exportExcel(list, "销售情况数据");
    }

    /**
     * 新增销售情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售情况
     */
    @RequiresPermissions("system:sales:add")
    @Log(title = "销售情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Sales sales)
    {
        return toAjax(salesService.insertSales(sales));
    }

    /**
     * 修改销售情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Sales sales = salesService.selectSalesById(id);
        mmap.put("sales", sales);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售情况
     */
    @RequiresPermissions("system:sales:edit")
    @Log(title = "销售情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Sales sales)
    {
        return toAjax(salesService.updateSales(sales));
    }

    /**
     * 删除销售情况
     */
    @RequiresPermissions("system:sales:remove")
    @Log(title = "销售情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(salesService.deleteSalesByIds(ids));
    }
}
