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
import com.ruoyi.system.domain.Nurseryfree;
import com.ruoyi.system.service.INurseryfreeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 育婴师空闲表Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/nurseryfree")
public class NurseryfreeController extends BaseController
{
    private String prefix = "system/nurseryfree";

    @Autowired
    private INurseryfreeService nurseryfreeService;

    @RequiresPermissions("system:nurseryfree:view")
    @GetMapping()
    public String nurseryfree()
    {
        return prefix + "/nurseryfree";
    }

    /**
     * 查询育婴师空闲表列表
     */
    @RequiresPermissions("system:nurseryfree:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Nurseryfree nurseryfree)
    {
        startPage();
        List<Nurseryfree> list = nurseryfreeService.selectNurseryfreeList(nurseryfree);
        return getDataTable(list);
    }

    /**
     * 导出育婴师空闲表列表
     */
    @RequiresPermissions("system:nurseryfree:export")
    @Log(title = "育婴师空闲表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Nurseryfree nurseryfree)
    {
        List<Nurseryfree> list = nurseryfreeService.selectNurseryfreeList(nurseryfree);
        ExcelUtil<Nurseryfree> util = new ExcelUtil<Nurseryfree>(Nurseryfree.class);
        return util.exportExcel(list, "育婴师空闲表数据");
    }

    /**
     * 新增育婴师空闲表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存育婴师空闲表
     */
    @RequiresPermissions("system:nurseryfree:add")
    @Log(title = "育婴师空闲表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Nurseryfree nurseryfree)
    {
        return toAjax(nurseryfreeService.insertNurseryfree(nurseryfree));
    }

    /**
     * 修改育婴师空闲表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Nurseryfree nurseryfree = nurseryfreeService.selectNurseryfreeById(id);
        mmap.put("nurseryfree", nurseryfree);
        return prefix + "/edit";
    }

    /**
     * 修改保存育婴师空闲表
     */
    @RequiresPermissions("system:nurseryfree:edit")
    @Log(title = "育婴师空闲表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Nurseryfree nurseryfree)
    {
        return toAjax(nurseryfreeService.updateNurseryfree(nurseryfree));
    }

    /**
     * 删除育婴师空闲表
     */
    @RequiresPermissions("system:nurseryfree:remove")
    @Log(title = "育婴师空闲表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nurseryfreeService.deleteNurseryfreeByIds(ids));
    }
}
