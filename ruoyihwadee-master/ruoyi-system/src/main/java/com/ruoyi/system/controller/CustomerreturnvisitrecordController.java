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
import com.ruoyi.system.domain.Customerreturnvisitrecord;
import com.ruoyi.system.service.ICustomerreturnvisitrecordService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户回访记录Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/customerreturnvisitrecord")
public class CustomerreturnvisitrecordController extends BaseController
{
    private String prefix = "system/customerreturnvisitrecord";

    @Autowired
    private ICustomerreturnvisitrecordService customerreturnvisitrecordService;

    @RequiresPermissions("system:customerreturnvisitrecord:view")
    @GetMapping()
    public String customerreturnvisitrecord()
    {
        return prefix + "/customerreturnvisitrecord";
    }

    /**
     * 查询客户回访记录列表
     */
    @RequiresPermissions("system:customerreturnvisitrecord:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Customerreturnvisitrecord customerreturnvisitrecord)
    {
        startPage();
        List<Customerreturnvisitrecord> list = customerreturnvisitrecordService.selectCustomerreturnvisitrecordList(customerreturnvisitrecord);
        return getDataTable(list);
    }

    /**
     * 导出客户回访记录列表
     */
    @RequiresPermissions("system:customerreturnvisitrecord:export")
    @Log(title = "客户回访记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Customerreturnvisitrecord customerreturnvisitrecord)
    {
        List<Customerreturnvisitrecord> list = customerreturnvisitrecordService.selectCustomerreturnvisitrecordList(customerreturnvisitrecord);
        ExcelUtil<Customerreturnvisitrecord> util = new ExcelUtil<Customerreturnvisitrecord>(Customerreturnvisitrecord.class);
        return util.exportExcel(list, "客户回访记录数据");
    }

    /**
     * 新增客户回访记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户回访记录
     */
    @RequiresPermissions("system:customerreturnvisitrecord:add")
    @Log(title = "客户回访记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Customerreturnvisitrecord customerreturnvisitrecord)
    {
        return toAjax(customerreturnvisitrecordService.insertCustomerreturnvisitrecord(customerreturnvisitrecord));
    }

    /**
     * 修改客户回访记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Customerreturnvisitrecord customerreturnvisitrecord = customerreturnvisitrecordService.selectCustomerreturnvisitrecordById(id);
        mmap.put("customerreturnvisitrecord", customerreturnvisitrecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户回访记录
     */
    @RequiresPermissions("system:customerreturnvisitrecord:edit")
    @Log(title = "客户回访记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Customerreturnvisitrecord customerreturnvisitrecord)
    {
        return toAjax(customerreturnvisitrecordService.updateCustomerreturnvisitrecord(customerreturnvisitrecord));
    }

    /**
     * 删除客户回访记录
     */
    @RequiresPermissions("system:customerreturnvisitrecord:remove")
    @Log(title = "客户回访记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerreturnvisitrecordService.deleteCustomerreturnvisitrecordByIds(ids));
    }
}
