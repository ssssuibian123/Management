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
import com.ruoyi.system.domain.CustomerCare;
import com.ruoyi.system.service.ICustomerCareService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * CustomerCareController
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/CustomerCare")
public class CustomerCareController extends BaseController
{
    private String prefix = "system/CustomerCare";

    @Autowired
    private ICustomerCareService customerCareService;

    @RequiresPermissions("system:CustomerCare:view")
    @GetMapping()
    public String CustomerCare()
    {
        return prefix + "/CustomerCare";
    }

    /**
     * 查询CustomerCare列表
     */
    @RequiresPermissions("system:CustomerCare:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerCare customerCare)
    {
        startPage();
        List<CustomerCare> list = customerCareService.selectCustomerCareList(customerCare);
        return getDataTable(list);
    }

    /**
     * 导出CustomerCare列表
     */
    @RequiresPermissions("system:CustomerCare:export")
    @Log(title = "CustomerCare", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerCare customerCare)
    {
        List<CustomerCare> list = customerCareService.selectCustomerCareList(customerCare);
        ExcelUtil<CustomerCare> util = new ExcelUtil<CustomerCare>(CustomerCare.class);
        return util.exportExcel(list, "CustomerCare数据");
    }

    /**
     * 新增CustomerCare
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存CustomerCare
     */
    @RequiresPermissions("system:CustomerCare:add")
    @Log(title = "CustomerCare", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerCare customerCare)
    {
        return toAjax(customerCareService.insertCustomerCare(customerCare));
    }

    /**
     * 修改CustomerCare
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CustomerCare customerCare = customerCareService.selectCustomerCareById(id);
        mmap.put("customerCare", customerCare);
        return prefix + "/edit";
    }

    /**
     * 修改保存CustomerCare
     */
    @RequiresPermissions("system:CustomerCare:edit")
    @Log(title = "CustomerCare", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerCare customerCare)
    {
        return toAjax(customerCareService.updateCustomerCare(customerCare));
    }

    /**
     * 删除CustomerCare
     */
    @RequiresPermissions("system:CustomerCare:remove")
    @Log(title = "CustomerCare", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerCareService.deleteCustomerCareByIds(ids));
    }
}
