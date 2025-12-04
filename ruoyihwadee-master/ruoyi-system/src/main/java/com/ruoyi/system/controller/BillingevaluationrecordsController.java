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
import com.ruoyi.system.domain.Billingevaluationrecords;
import com.ruoyi.system.service.IBillingevaluationrecordsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 结算与评价记录Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/billingevaluationrecords")
public class BillingevaluationrecordsController extends BaseController
{
    private String prefix = "system/billingevaluationrecords";

    @Autowired
    private IBillingevaluationrecordsService billingevaluationrecordsService;

    @RequiresPermissions("system:billingevaluationrecords:view")
    @GetMapping()
    public String billingevaluationrecords()
    {
        return prefix + "/billingevaluationrecords";
    }

    /**
     * 查询结算与评价记录列表
     */
    @RequiresPermissions("system:billingevaluationrecords:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Billingevaluationrecords billingevaluationrecords)
    {
        startPage();
        List<Billingevaluationrecords> list = billingevaluationrecordsService.selectBillingevaluationrecordsList(billingevaluationrecords);
        return getDataTable(list);
    }

    /**
     * 导出结算与评价记录列表
     */
    @RequiresPermissions("system:billingevaluationrecords:export")
    @Log(title = "结算与评价记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Billingevaluationrecords billingevaluationrecords)
    {
        List<Billingevaluationrecords> list = billingevaluationrecordsService.selectBillingevaluationrecordsList(billingevaluationrecords);
        ExcelUtil<Billingevaluationrecords> util = new ExcelUtil<Billingevaluationrecords>(Billingevaluationrecords.class);
        return util.exportExcel(list, "结算与评价记录数据");
    }

    /**
     * 新增结算与评价记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存结算与评价记录
     */
    @RequiresPermissions("system:billingevaluationrecords:add")
    @Log(title = "结算与评价记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Billingevaluationrecords billingevaluationrecords)
    {
        return toAjax(billingevaluationrecordsService.insertBillingevaluationrecords(billingevaluationrecords));
    }

    /**
     * 修改结算与评价记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Billingevaluationrecords billingevaluationrecords = billingevaluationrecordsService.selectBillingevaluationrecordsById(id);
        mmap.put("billingevaluationrecords", billingevaluationrecords);
        return prefix + "/edit";
    }

    /**
     * 修改保存结算与评价记录
     */
    @RequiresPermissions("system:billingevaluationrecords:edit")
    @Log(title = "结算与评价记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Billingevaluationrecords billingevaluationrecords)
    {
        return toAjax(billingevaluationrecordsService.updateBillingevaluationrecords(billingevaluationrecords));
    }

    /**
     * 删除结算与评价记录
     */
    @RequiresPermissions("system:billingevaluationrecords:remove")
    @Log(title = "结算与评价记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(billingevaluationrecordsService.deleteBillingevaluationrecordsByIds(ids));
    }
}
