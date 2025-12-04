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
import com.ruoyi.system.domain.Conterman;
import com.ruoyi.system.service.IContermanService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人员信息管理Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/conterman")
public class ContermanController extends BaseController
{
    private String prefix = "system/conterman";

    @Autowired
    private IContermanService contermanService;

    @RequiresPermissions("system:conterman:view")
    @GetMapping()
    public String conterman()
    {
        return prefix + "/conterman";
    }

    /**
     * 查询人员信息管理列表
     */
    @RequiresPermissions("system:conterman:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Conterman conterman)
    {
        startPage();
        List<Conterman> list = contermanService.selectContermanList(conterman);
        return getDataTable(list);
    }

    /**
     * 导出人员信息管理列表
     */
    @RequiresPermissions("system:conterman:export")
    @Log(title = "人员信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Conterman conterman)
    {
        List<Conterman> list = contermanService.selectContermanList(conterman);
        ExcelUtil<Conterman> util = new ExcelUtil<Conterman>(Conterman.class);
        return util.exportExcel(list, "人员信息管理数据");
    }

    /**
     * 新增人员信息管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存人员信息管理
     */
    @RequiresPermissions("system:conterman:add")
    @Log(title = "人员信息管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Conterman conterman)
    {
        return toAjax(contermanService.insertConterman(conterman));
    }

    /**
     * 修改人员信息管理
     */
    @GetMapping("/edit/{contermanId}")
    public String edit(@PathVariable("contermanId") Long contermanId, ModelMap mmap)
    {
        Conterman conterman = contermanService.selectContermanById(contermanId);
        mmap.put("conterman", conterman);
        return prefix + "/edit";
    }

    /**
     * 修改保存人员信息管理
     */
    @RequiresPermissions("system:conterman:edit")
    @Log(title = "人员信息管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Conterman conterman)
    {
        return toAjax(contermanService.updateConterman(conterman));
    }

    /**
     * 删除人员信息管理
     */
    @RequiresPermissions("system:conterman:remove")
    @Log(title = "人员信息管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(contermanService.deleteContermanByIds(ids));
    }
}
