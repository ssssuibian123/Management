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
import com.ruoyi.system.domain.Contractinformation;
import com.ruoyi.system.service.IContractinformationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 合同信息表Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/contractinformation")
public class ContractinformationController extends BaseController
{
    private String prefix = "system/contractinformation";

    @Autowired
    private IContractinformationService contractinformationService;

    @RequiresPermissions("system:contractinformation:view")
    @GetMapping()
    public String contractinformation()
    {
        return prefix + "/contractinformation";
    }

    /**
     * 查询合同信息表列表
     */
    @RequiresPermissions("system:contractinformation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Contractinformation contractinformation)
    {
        startPage();
        List<Contractinformation> list = contractinformationService.selectContractinformationList(contractinformation);
        return getDataTable(list);
    }

    /**
     * 导出合同信息表列表
     */
    @RequiresPermissions("system:contractinformation:export")
    @Log(title = "合同信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Contractinformation contractinformation)
    {
        List<Contractinformation> list = contractinformationService.selectContractinformationList(contractinformation);
        ExcelUtil<Contractinformation> util = new ExcelUtil<Contractinformation>(Contractinformation.class);
        return util.exportExcel(list, "合同信息表数据");
    }

    /**
     * 新增合同信息表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存合同信息表
     */
    @RequiresPermissions("system:contractinformation:add")
    @Log(title = "合同信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Contractinformation contractinformation)
    {
        return toAjax(contractinformationService.insertContractinformation(contractinformation));
    }

    /**
     * 修改合同信息表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Contractinformation contractinformation = contractinformationService.selectContractinformationById(id);
        mmap.put("contractinformation", contractinformation);
        return prefix + "/edit";
    }

    /**
     * 修改保存合同信息表
     */
    @RequiresPermissions("system:contractinformation:edit")
    @Log(title = "合同信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Contractinformation contractinformation)
    {
        return toAjax(contractinformationService.updateContractinformation(contractinformation));
    }

    /**
     * 删除合同信息表
     */
    @RequiresPermissions("system:contractinformation:remove")
    @Log(title = "合同信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(contractinformationService.deleteContractinformationByIds(ids));
    }
}
