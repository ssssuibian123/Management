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
import com.ruoyi.system.domain.promotionReminder;
import com.ruoyi.system.service.IpromotionReminderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 晋升提醒Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/promotionReminder")
public class promotionReminderController extends BaseController
{
    private String prefix = "system/promotionReminder";

    @Autowired
    private IpromotionReminderService promotionReminderService;

    @RequiresPermissions("system:promotionReminder:view")
    @GetMapping()
    public String promotionReminder()
    {
        return prefix + "/promotionReminder";
    }

    /**
     * 查询晋升提醒列表
     */
    @RequiresPermissions("system:promotionReminder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(promotionReminder promotionReminder)
    {
        startPage();
        List<promotionReminder> list = promotionReminderService.selectpromotionReminderList(promotionReminder);
        return getDataTable(list);
    }

    /**
     * 导出晋升提醒列表
     */
    @RequiresPermissions("system:promotionReminder:export")
    @Log(title = "晋升提醒", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(promotionReminder promotionReminder)
    {
        List<promotionReminder> list = promotionReminderService.selectpromotionReminderList(promotionReminder);
        ExcelUtil<promotionReminder> util = new ExcelUtil<promotionReminder>(promotionReminder.class);
        return util.exportExcel(list, "晋升提醒数据");
    }

    /**
     * 新增晋升提醒
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存晋升提醒
     */
    @RequiresPermissions("system:promotionReminder:add")
    @Log(title = "晋升提醒", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(promotionReminder promotionReminder)
    {
        return toAjax(promotionReminderService.insertpromotionReminder(promotionReminder));
    }

    /**
     * 修改晋升提醒
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        promotionReminder promotionReminder = promotionReminderService.selectpromotionReminderById(id);
        mmap.put("promotionReminder", promotionReminder);
        return prefix + "/edit";
    }

    /**
     * 修改保存晋升提醒
     */
    @RequiresPermissions("system:promotionReminder:edit")
    @Log(title = "晋升提醒", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(promotionReminder promotionReminder)
    {
        return toAjax(promotionReminderService.updatepromotionReminder(promotionReminder));
    }

    /**
     * 删除晋升提醒
     */
    @RequiresPermissions("system:promotionReminder:remove")
    @Log(title = "晋升提醒", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(promotionReminderService.deletepromotionReminderByIds(ids));
    }
}
