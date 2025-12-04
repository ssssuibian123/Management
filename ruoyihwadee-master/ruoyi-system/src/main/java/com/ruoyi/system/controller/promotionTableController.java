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
import com.ruoyi.system.domain.promotionTable;
import com.ruoyi.system.service.IpromotionTableService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 晋升表Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/promotiontable")
public class promotionTableController extends BaseController
{
    private String prefix = "system/promotiontable";

    @Autowired
    private IpromotionTableService promotionTableService;

    @RequiresPermissions("system:promotiontable:view")
    @GetMapping()
    public String promotiontable()
    {
        return prefix + "/promotiontable";
    }

    /**
     * 查询晋升表列表
     */
    @RequiresPermissions("system:promotiontable:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(promotionTable promotionTable)
    {
        startPage();
        List<promotionTable> list = promotionTableService.selectpromotionTableList(promotionTable);
        return getDataTable(list);
    }

    /**
     * 导出晋升表列表
     */
    @RequiresPermissions("system:promotiontable:export")
    @Log(title = "晋升表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(promotionTable promotionTable)
    {
        List<promotionTable> list = promotionTableService.selectpromotionTableList(promotionTable);
        ExcelUtil<promotionTable> util = new ExcelUtil<promotionTable>(promotionTable.class);
        return util.exportExcel(list, "晋升表数据");
    }

    /**
     * 新增晋升表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存晋升表
     */
    @RequiresPermissions("system:promotiontable:add")
    @Log(title = "晋升表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(promotionTable promotionTable)
    {
        return toAjax(promotionTableService.insertpromotionTable(promotionTable));
    }

    /**
     * 修改晋升表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        promotionTable promotionTable = promotionTableService.selectpromotionTableById(id);
        mmap.put("promotionTable", promotionTable);
        return prefix + "/edit";
    }

    /**
     * 修改保存晋升表
     */
    @RequiresPermissions("system:promotiontable:edit")
    @Log(title = "晋升表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(promotionTable promotionTable)
    {
        return toAjax(promotionTableService.updatepromotionTable(promotionTable));
    }

    /**
     * 删除晋升表
     */
    @RequiresPermissions("system:promotiontable:remove")
    @Log(title = "晋升表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(promotionTableService.deletepromotionTableByIds(ids));
    }
}
