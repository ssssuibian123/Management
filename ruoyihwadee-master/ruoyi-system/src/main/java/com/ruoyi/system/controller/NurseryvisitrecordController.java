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
import com.ruoyi.system.domain.Nurseryvisitrecord;
import com.ruoyi.system.service.INurseryvisitrecordService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 育婴师回访记录Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/nurseryvisitrecord")
public class NurseryvisitrecordController extends BaseController
{
    private String prefix = "system/nurseryvisitrecord";

    @Autowired
    private INurseryvisitrecordService nurseryvisitrecordService;

    @RequiresPermissions("system:nurseryvisitrecord:view")
    @GetMapping()
    public String nurseryvisitrecord()
    {
        return prefix + "/nurseryvisitrecord";
    }

    /**
     * 查询育婴师回访记录列表
     */
    @RequiresPermissions("system:nurseryvisitrecord:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Nurseryvisitrecord nurseryvisitrecord)
    {
        startPage();
        List<Nurseryvisitrecord> list = nurseryvisitrecordService.selectNurseryvisitrecordList(nurseryvisitrecord);
        return getDataTable(list);
    }

    /**
     * 导出育婴师回访记录列表
     */
    @RequiresPermissions("system:nurseryvisitrecord:export")
    @Log(title = "育婴师回访记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Nurseryvisitrecord nurseryvisitrecord)
    {
        List<Nurseryvisitrecord> list = nurseryvisitrecordService.selectNurseryvisitrecordList(nurseryvisitrecord);
        ExcelUtil<Nurseryvisitrecord> util = new ExcelUtil<Nurseryvisitrecord>(Nurseryvisitrecord.class);
        return util.exportExcel(list, "育婴师回访记录数据");
    }

    /**
     * 新增育婴师回访记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存育婴师回访记录
     */
    @RequiresPermissions("system:nurseryvisitrecord:add")
    @Log(title = "育婴师回访记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Nurseryvisitrecord nurseryvisitrecord)
    {
        return toAjax(nurseryvisitrecordService.insertNurseryvisitrecord(nurseryvisitrecord));
    }

    /**
     * 修改育婴师回访记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Nurseryvisitrecord nurseryvisitrecord = nurseryvisitrecordService.selectNurseryvisitrecordById(id);
        mmap.put("nurseryvisitrecord", nurseryvisitrecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存育婴师回访记录
     */
    @RequiresPermissions("system:nurseryvisitrecord:edit")
    @Log(title = "育婴师回访记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Nurseryvisitrecord nurseryvisitrecord)
    {
        return toAjax(nurseryvisitrecordService.updateNurseryvisitrecord(nurseryvisitrecord));
    }

    /**
     * 删除育婴师回访记录
     */
    @RequiresPermissions("system:nurseryvisitrecord:remove")
    @Log(title = "育婴师回访记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nurseryvisitrecordService.deleteNurseryvisitrecordByIds(ids));
    }
}
