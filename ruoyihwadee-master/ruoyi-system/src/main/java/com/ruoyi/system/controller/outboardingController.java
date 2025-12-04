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
import com.ruoyi.system.domain.outboarding;
import com.ruoyi.system.service.IoutboardingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 离职界面Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/outboarding")
public class outboardingController extends BaseController
{
    private String prefix = "system/outboarding";

    @Autowired
    private IoutboardingService outboardingService;

    @RequiresPermissions("system:outboarding:view")
    @GetMapping()
    public String outboarding()
    {
        return prefix + "/outboarding";
    }

    /**
     * 查询离职界面列表
     */
    @RequiresPermissions("system:outboarding:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(outboarding outboarding)
    {
        startPage();
        List<outboarding> list = outboardingService.selectoutboardingList(outboarding);
        return getDataTable(list);
    }

    /**
     * 导出离职界面列表
     */
    @RequiresPermissions("system:outboarding:export")
    @Log(title = "离职界面", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(outboarding outboarding)
    {
        List<outboarding> list = outboardingService.selectoutboardingList(outboarding);
        ExcelUtil<outboarding> util = new ExcelUtil<outboarding>(outboarding.class);
        return util.exportExcel(list, "离职界面数据");
    }

    /**
     * 新增离职界面
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存离职界面
     */
    @RequiresPermissions("system:outboarding:add")
    @Log(title = "离职界面", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(outboarding outboarding)
    {
        return toAjax(outboardingService.insertoutboarding(outboarding));
    }

    /**
     * 修改离职界面
     */
    @GetMapping("/edit/{onboardingId}")
    public String edit(@PathVariable("onboardingId") Long onboardingId, ModelMap mmap)
    {
        outboarding outboarding = outboardingService.selectoutboardingById(onboardingId);
        mmap.put("outboarding", outboarding);
        return prefix + "/edit";
    }

    /**
     * 修改保存离职界面
     */
    @RequiresPermissions("system:outboarding:edit")
    @Log(title = "离职界面", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(outboarding outboarding)
    {
        return toAjax(outboardingService.updateoutboarding(outboarding));
    }

    /**
     * 删除离职界面
     */
    @RequiresPermissions("system:outboarding:remove")
    @Log(title = "离职界面", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(outboardingService.deleteoutboardingByIds(ids));
    }
}
