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
import com.ruoyi.system.domain.ContermanBirthday;
import com.ruoyi.system.service.IContermanBirthdayService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工生日提醒Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/ContermanBirthday")
public class ContermanBirthdayController extends BaseController
{
    private String prefix = "system/ContermanBirthday";

    @Autowired
    private IContermanBirthdayService contermanBirthdayService;

    @RequiresPermissions("system:ContermanBirthday:view")
    @GetMapping()
    public String ContermanBirthday()
    {
        return prefix + "/ContermanBirthday";
    }

    /**
     * 查询员工生日提醒列表
     */
    @RequiresPermissions("system:ContermanBirthday:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ContermanBirthday contermanBirthday)
    {
        startPage();
        List<ContermanBirthday> list = contermanBirthdayService.selectContermanBirthdayList(contermanBirthday);
        return getDataTable(list);
    }

    /**
     * 导出员工生日提醒列表
     */
    @RequiresPermissions("system:ContermanBirthday:export")
    @Log(title = "员工生日提醒", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ContermanBirthday contermanBirthday)
    {
        List<ContermanBirthday> list = contermanBirthdayService.selectContermanBirthdayList(contermanBirthday);
        ExcelUtil<ContermanBirthday> util = new ExcelUtil<ContermanBirthday>(ContermanBirthday.class);
        return util.exportExcel(list, "员工生日提醒数据");
    }

    /**
     * 新增员工生日提醒
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存员工生日提醒
     */
    @RequiresPermissions("system:ContermanBirthday:add")
    @Log(title = "员工生日提醒", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ContermanBirthday contermanBirthday)
    {
        return toAjax(contermanBirthdayService.insertContermanBirthday(contermanBirthday));
    }

    /**
     * 修改员工生日提醒
     */
    @GetMapping("/edit/{contermanId}")
    public String edit(@PathVariable("contermanId") Long contermanId, ModelMap mmap)
    {
        ContermanBirthday contermanBirthday = contermanBirthdayService.selectContermanBirthdayById(contermanId);
        mmap.put("contermanBirthday", contermanBirthday);
        return prefix + "/edit";
    }

    /**
     * 修改保存员工生日提醒
     */
    @RequiresPermissions("system:ContermanBirthday:edit")
    @Log(title = "员工生日提醒", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ContermanBirthday contermanBirthday)
    {
        return toAjax(contermanBirthdayService.updateContermanBirthday(contermanBirthday));
    }

    /**
     * 删除员工生日提醒
     */
    @RequiresPermissions("system:ContermanBirthday:remove")
    @Log(title = "员工生日提醒", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(contermanBirthdayService.deleteContermanBirthdayByIds(ids));
    }
}
