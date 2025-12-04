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
import com.ruoyi.system.domain.Nurseryworking;
import com.ruoyi.system.service.INurseryworkingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 育婴师工作状态表Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/nurseryworking")
public class NurseryworkingController extends BaseController
{
    private String prefix = "system/nurseryworking";

    @Autowired
    private INurseryworkingService nurseryworkingService;

    @RequiresPermissions("system:nurseryworking:view")
    @GetMapping()
    public String nurseryworking()
    {
        return prefix + "/nurseryworking";
    }

    /**
     * 查询育婴师工作状态表列表
     */
    @RequiresPermissions("system:nurseryworking:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Nurseryworking nurseryworking)
    {
        startPage();
        List<Nurseryworking> list = nurseryworkingService.selectNurseryworkingList(nurseryworking);
        return getDataTable(list);
    }

    /**
     * 导出育婴师工作状态表列表
     */
    @RequiresPermissions("system:nurseryworking:export")
    @Log(title = "育婴师工作状态表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Nurseryworking nurseryworking)
    {
        List<Nurseryworking> list = nurseryworkingService.selectNurseryworkingList(nurseryworking);
        ExcelUtil<Nurseryworking> util = new ExcelUtil<Nurseryworking>(Nurseryworking.class);
        return util.exportExcel(list, "育婴师工作状态表数据");
    }

    /**
     * 新增育婴师工作状态表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存育婴师工作状态表
     */
    @RequiresPermissions("system:nurseryworking:add")
    @Log(title = "育婴师工作状态表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Nurseryworking nurseryworking)
    {
        return toAjax(nurseryworkingService.insertNurseryworking(nurseryworking));
    }

    /**
     * 修改育婴师工作状态表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Nurseryworking nurseryworking = nurseryworkingService.selectNurseryworkingById(id);
        mmap.put("nurseryworking", nurseryworking);
        return prefix + "/edit";
    }

    /**
     * 修改保存育婴师工作状态表
     */
    @RequiresPermissions("system:nurseryworking:edit")
    @Log(title = "育婴师工作状态表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Nurseryworking nurseryworking)
    {
        return toAjax(nurseryworkingService.updateNurseryworking(nurseryworking));
    }

    /**
     * 删除育婴师工作状态表
     */
    @RequiresPermissions("system:nurseryworking:remove")
    @Log(title = "育婴师工作状态表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nurseryworkingService.deleteNurseryworkingByIds(ids));
    }
}
