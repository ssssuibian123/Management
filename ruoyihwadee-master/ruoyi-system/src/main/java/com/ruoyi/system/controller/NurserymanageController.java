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
import com.ruoyi.system.domain.Nurserymanage;
import com.ruoyi.system.service.INurserymanageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 育婴师管理Controller
 * 
 * @author aower
 * @date 2022-02-19
 */
@Controller
@RequestMapping("/system/nurserymanage")
public class NurserymanageController extends BaseController
{
    private String prefix = "system/nurserymanage";

    @Autowired
    private INurserymanageService nurserymanageService;

    @RequiresPermissions("system:nurserymanage:view")
    @GetMapping()
    public String nurserymanage()
    {
        return prefix + "/nurserymanage";
    }

    /**
     * 查询育婴师管理列表
     */
    @RequiresPermissions("system:nurserymanage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Nurserymanage nurserymanage)
    {
        startPage();
        List<Nurserymanage> list = nurserymanageService.selectNurserymanageList(nurserymanage);
        return getDataTable(list);
    }

    /**
     * 导出育婴师管理列表
     */
    @RequiresPermissions("system:nurserymanage:export")
    @Log(title = "育婴师管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Nurserymanage nurserymanage)
    {
        List<Nurserymanage> list = nurserymanageService.selectNurserymanageList(nurserymanage);
        ExcelUtil<Nurserymanage> util = new ExcelUtil<Nurserymanage>(Nurserymanage.class);
        return util.exportExcel(list, "育婴师管理数据");
    }

    /**
     * 新增育婴师管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存育婴师管理
     */
    @RequiresPermissions("system:nurserymanage:add")
    @Log(title = "育婴师管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Nurserymanage nurserymanage)
    {
        return toAjax(nurserymanageService.insertNurserymanage(nurserymanage));
    }

    /**
     * 修改育婴师管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Nurserymanage nurserymanage = nurserymanageService.selectNurserymanageById(id);
        mmap.put("nurserymanage", nurserymanage);
        return prefix + "/edit";
    }

    /**
     * 修改保存育婴师管理
     */
    @RequiresPermissions("system:nurserymanage:edit")
    @Log(title = "育婴师管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Nurserymanage nurserymanage)
    {
        return toAjax(nurserymanageService.updateNurserymanage(nurserymanage));
    }

    /**
     * 删除育婴师管理
     */
    @RequiresPermissions("system:nurserymanage:remove")
    @Log(title = "育婴师管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nurserymanageService.deleteNurserymanageByIds(ids));
    }
}
