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
import com.ruoyi.system.domain.ReceptionSituation;
import com.ruoyi.system.service.IReceptionSituationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 接待情况Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/receptionsituation")
public class ReceptionSituationController extends BaseController
{
    private String prefix = "system/receptionsituation";

    @Autowired
    private IReceptionSituationService receptionSituationService;

    @RequiresPermissions("system:receptionsituation:view")
    @GetMapping()
    public String receptionsituation()
    {
        return prefix + "/receptionsituation";
    }

    /**
     * 查询接待情况列表
     */
    @RequiresPermissions("system:receptionsituation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ReceptionSituation receptionSituation)
    {
        startPage();
        List<ReceptionSituation> list = receptionSituationService.selectReceptionSituationList(receptionSituation);
        return getDataTable(list);
    }

    /**
     * 导出接待情况列表
     */
    @RequiresPermissions("system:receptionsituation:export")
    @Log(title = "接待情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ReceptionSituation receptionSituation)
    {
        List<ReceptionSituation> list = receptionSituationService.selectReceptionSituationList(receptionSituation);
        ExcelUtil<ReceptionSituation> util = new ExcelUtil<ReceptionSituation>(ReceptionSituation.class);
        return util.exportExcel(list, "接待情况数据");
    }

    /**
     * 新增接待情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存接待情况
     */
    @RequiresPermissions("system:receptionsituation:add")
    @Log(title = "接待情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ReceptionSituation receptionSituation)
    {
        return toAjax(receptionSituationService.insertReceptionSituation(receptionSituation));
    }

    /**
     * 修改接待情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        ReceptionSituation receptionSituation = receptionSituationService.selectReceptionSituationById(id);
        mmap.put("receptionSituation", receptionSituation);
        return prefix + "/edit";
    }

    /**
     * 修改保存接待情况
     */
    @RequiresPermissions("system:receptionsituation:edit")
    @Log(title = "接待情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ReceptionSituation receptionSituation)
    {
        return toAjax(receptionSituationService.updateReceptionSituation(receptionSituation));
    }

    /**
     * 删除接待情况
     */
    @RequiresPermissions("system:receptionsituation:remove")
    @Log(title = "接待情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(receptionSituationService.deleteReceptionSituationByIds(ids));
    }
}
