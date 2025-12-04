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
import com.ruoyi.system.domain.Onboarding;
import com.ruoyi.system.service.IOnboardingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 入职界面Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/onboarding")
public class OnboardingController extends BaseController
{
    private String prefix = "system/onboarding";

    @Autowired
    private IOnboardingService onboardingService;

    @RequiresPermissions("system:onboarding:view")
    @GetMapping()
    public String onboarding()
    {
        return prefix + "/onboarding";
    }

    /**
     * 查询入职界面列表
     */
    @RequiresPermissions("system:onboarding:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Onboarding onboarding)
    {
        startPage();
        List<Onboarding> list = onboardingService.selectOnboardingList(onboarding);
        return getDataTable(list);
    }

    /**
     * 导出入职界面列表
     */
    @RequiresPermissions("system:onboarding:export")
    @Log(title = "入职界面", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Onboarding onboarding)
    {
        List<Onboarding> list = onboardingService.selectOnboardingList(onboarding);
        ExcelUtil<Onboarding> util = new ExcelUtil<Onboarding>(Onboarding.class);
        return util.exportExcel(list, "入职界面数据");
    }

    /**
     * 新增入职界面
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存入职界面
     */
    @RequiresPermissions("system:onboarding:add")
    @Log(title = "入职界面", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Onboarding onboarding)
    {
        return toAjax(onboardingService.insertOnboarding(onboarding));
    }

    /**
     * 修改入职界面
     */
    @GetMapping("/edit/{onboardingId}")
    public String edit(@PathVariable("onboardingId") Long onboardingId, ModelMap mmap)
    {
        Onboarding onboarding = onboardingService.selectOnboardingById(onboardingId);
        mmap.put("onboarding", onboarding);
        return prefix + "/edit";
    }

    /**
     * 修改保存入职界面
     */
    @RequiresPermissions("system:onboarding:edit")
    @Log(title = "入职界面", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Onboarding onboarding)
    {
        return toAjax(onboardingService.updateOnboarding(onboarding));
    }

    /**
     * 删除入职界面
     */
    @RequiresPermissions("system:onboarding:remove")
    @Log(title = "入职界面", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(onboardingService.deleteOnboardingByIds(ids));
    }
}
