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
import com.ruoyi.system.domain.Billingmessage;
import com.ruoyi.system.service.IBillingmessageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收款信息表Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/billingmessage")
public class BillingmessageController extends BaseController
{
    private String prefix = "system/billingmessage";

    @Autowired
    private IBillingmessageService billingmessageService;

    @RequiresPermissions("system:billingmessage:view")
    @GetMapping()
    public String billingmessage()
    {
        return prefix + "/billingmessage";
    }

    /**
     * 查询收款信息表列表
     */
    @RequiresPermissions("system:billingmessage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Billingmessage billingmessage)
    {
        startPage();
        List<Billingmessage> list = billingmessageService.selectBillingmessageList(billingmessage);
        return getDataTable(list);
    }

    /**
     * 导出收款信息表列表
     */
    @RequiresPermissions("system:billingmessage:export")
    @Log(title = "收款信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Billingmessage billingmessage)
    {
        List<Billingmessage> list = billingmessageService.selectBillingmessageList(billingmessage);
        ExcelUtil<Billingmessage> util = new ExcelUtil<Billingmessage>(Billingmessage.class);
        return util.exportExcel(list, "收款信息表数据");
    }

    /**
     * 新增收款信息表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存收款信息表
     */
    @RequiresPermissions("system:billingmessage:add")
    @Log(title = "收款信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Billingmessage billingmessage)
    {
        return toAjax(billingmessageService.insertBillingmessage(billingmessage));
    }

    /**
     * 修改收款信息表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Billingmessage billingmessage = billingmessageService.selectBillingmessageById(id);
        mmap.put("billingmessage", billingmessage);
        return prefix + "/edit";
    }

    /**
     * 修改保存收款信息表
     */
    @RequiresPermissions("system:billingmessage:edit")
    @Log(title = "收款信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Billingmessage billingmessage)
    {
        return toAjax(billingmessageService.updateBillingmessage(billingmessage));
    }

    /**
     * 删除收款信息表
     */
    @RequiresPermissions("system:billingmessage:remove")
    @Log(title = "收款信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(billingmessageService.deleteBillingmessageByIds(ids));
    }
}
