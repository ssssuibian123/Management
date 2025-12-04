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
import com.ruoyi.system.domain.Followup;
import com.ruoyi.system.service.IFollowupService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 跟进情况Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/followup")
public class FollowupController extends BaseController
{
    private String prefix = "system/followup";

    @Autowired
    private IFollowupService followupService;

    @RequiresPermissions("system:followup:view")
    @GetMapping()
    public String followup()
    {
        return prefix + "/followup";
    }

    /**
     * 查询跟进情况列表
     */
    @RequiresPermissions("system:followup:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Followup followup)
    {
        startPage();
        List<Followup> list = followupService.selectFollowupList(followup);
        return getDataTable(list);
    }

    /**
     * 导出跟进情况列表
     */
    @RequiresPermissions("system:followup:export")
    @Log(title = "跟进情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Followup followup)
    {
        List<Followup> list = followupService.selectFollowupList(followup);
        ExcelUtil<Followup> util = new ExcelUtil<Followup>(Followup.class);
        return util.exportExcel(list, "跟进情况数据");
    }

    /**
     * 新增跟进情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存跟进情况
     */
    @RequiresPermissions("system:followup:add")
    @Log(title = "跟进情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Followup followup)
    {
        return toAjax(followupService.insertFollowup(followup));
    }

    /**
     * 修改跟进情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Followup followup = followupService.selectFollowupById(id);
        mmap.put("followup", followup);
        return prefix + "/edit";
    }

    /**
     * 修改保存跟进情况
     */
    @RequiresPermissions("system:followup:edit")
    @Log(title = "跟进情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Followup followup)
    {
        return toAjax(followupService.updateFollowup(followup));
    }

    /**
     * 删除跟进情况
     */
    @RequiresPermissions("system:followup:remove")
    @Log(title = "跟进情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(followupService.deleteFollowupByIds(ids));
    }
}
