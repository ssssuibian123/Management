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
import com.ruoyi.system.domain.Customerfollowrecords;
import com.ruoyi.system.service.ICustomerfollowrecordsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户跟进记录Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/customerfollowrecords")
public class CustomerfollowrecordsController extends BaseController
{
    private String prefix = "system/customerfollowrecords";

    @Autowired
    private ICustomerfollowrecordsService customerfollowrecordsService;

    @RequiresPermissions("system:customerfollowrecords:view")
    @GetMapping()
    public String customerfollowrecords()
    {
        return prefix + "/customerfollowrecords";
    }

    /**
     * 查询客户跟进记录列表
     */
    @RequiresPermissions("system:customerfollowrecords:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Customerfollowrecords customerfollowrecords)
    {
        startPage();
        List<Customerfollowrecords> list = customerfollowrecordsService.selectCustomerfollowrecordsList(customerfollowrecords);
        return getDataTable(list);
    }

    /**
     * 导出客户跟进记录列表
     */
    @RequiresPermissions("system:customerfollowrecords:export")
    @Log(title = "客户跟进记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Customerfollowrecords customerfollowrecords)
    {
        List<Customerfollowrecords> list = customerfollowrecordsService.selectCustomerfollowrecordsList(customerfollowrecords);
        ExcelUtil<Customerfollowrecords> util = new ExcelUtil<Customerfollowrecords>(Customerfollowrecords.class);
        return util.exportExcel(list, "客户跟进记录数据");
    }

    /**
     * 新增客户跟进记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户跟进记录
     */
    @RequiresPermissions("system:customerfollowrecords:add")
    @Log(title = "客户跟进记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Customerfollowrecords customerfollowrecords)
    {
        return toAjax(customerfollowrecordsService.insertCustomerfollowrecords(customerfollowrecords));
    }

    /**
     * 修改客户跟进记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Customerfollowrecords customerfollowrecords = customerfollowrecordsService.selectCustomerfollowrecordsById(id);
        mmap.put("customerfollowrecords", customerfollowrecords);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户跟进记录
     */
    @RequiresPermissions("system:customerfollowrecords:edit")
    @Log(title = "客户跟进记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Customerfollowrecords customerfollowrecords)
    {
        return toAjax(customerfollowrecordsService.updateCustomerfollowrecords(customerfollowrecords));
    }

    /**
     * 删除客户跟进记录
     */
    @RequiresPermissions("system:customerfollowrecords:remove")
    @Log(title = "客户跟进记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerfollowrecordsService.deleteCustomerfollowrecordsByIds(ids));
    }
}
