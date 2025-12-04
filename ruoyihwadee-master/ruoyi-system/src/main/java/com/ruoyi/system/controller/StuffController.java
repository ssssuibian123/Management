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
import com.ruoyi.system.domain.Stuff;
import com.ruoyi.system.service.IStuffService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 上岗人员Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/stuff")
public class StuffController extends BaseController
{
    private String prefix = "system/stuff";

    @Autowired
    private IStuffService stuffService;

    @RequiresPermissions("system:stuff:view")
    @GetMapping()
    public String stuff()
    {
        return prefix + "/stuff";
    }

    /**
     * 查询上岗人员列表
     */
    @RequiresPermissions("system:stuff:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Stuff stuff)
    {
        startPage();
        List<Stuff> list = stuffService.selectStuffList(stuff);
        return getDataTable(list);
    }

    /**
     * 导出上岗人员列表
     */
    @RequiresPermissions("system:stuff:export")
    @Log(title = "上岗人员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Stuff stuff)
    {
        List<Stuff> list = stuffService.selectStuffList(stuff);
        ExcelUtil<Stuff> util = new ExcelUtil<Stuff>(Stuff.class);
        return util.exportExcel(list, "上岗人员数据");
    }

    /**
     * 新增上岗人员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存上岗人员
     */
    @RequiresPermissions("system:stuff:add")
    @Log(title = "上岗人员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Stuff stuff)
    {
        return toAjax(stuffService.insertStuff(stuff));
    }

    /**
     * 修改上岗人员
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Stuff stuff = stuffService.selectStuffById(id);
        mmap.put("stuff", stuff);
        return prefix + "/edit";
    }

    /**
     * 修改保存上岗人员
     */
    @RequiresPermissions("system:stuff:edit")
    @Log(title = "上岗人员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Stuff stuff)
    {
        return toAjax(stuffService.updateStuff(stuff));
    }

    /**
     * 删除上岗人员
     */
    @RequiresPermissions("system:stuff:remove")
    @Log(title = "上岗人员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stuffService.deleteStuffByIds(ids));
    }
}
