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
import com.ruoyi.system.domain.Callandvisit;
import com.ruoyi.system.service.ICallandvisitService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 来电来访情况Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/callandvisit")
public class CallandvisitController extends BaseController
{
    private String prefix = "system/callandvisit";

    @Autowired
    private ICallandvisitService callandvisitService;

    @RequiresPermissions("system:callandvisit:view")
    @GetMapping()
    public String callandvisit()
    {
        return prefix + "/callandvisit";
    }

    /**
     * 查询来电来访情况列表
     */
    @RequiresPermissions("system:callandvisit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Callandvisit callandvisit)
    {
        startPage();
        List<Callandvisit> list = callandvisitService.selectCallandvisitList(callandvisit);
        return getDataTable(list);
    }

    /**
     * 导出来电来访情况列表
     */
    @RequiresPermissions("system:callandvisit:export")
    @Log(title = "来电来访情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Callandvisit callandvisit)
    {
        List<Callandvisit> list = callandvisitService.selectCallandvisitList(callandvisit);
        ExcelUtil<Callandvisit> util = new ExcelUtil<Callandvisit>(Callandvisit.class);
        return util.exportExcel(list, "来电来访情况数据");
    }

    /**
     * 新增来电来访情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存来电来访情况
     */
    @RequiresPermissions("system:callandvisit:add")
    @Log(title = "来电来访情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Callandvisit callandvisit)
    {
        return toAjax(callandvisitService.insertCallandvisit(callandvisit));
    }

    /**
     * 修改来电来访情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Callandvisit callandvisit = callandvisitService.selectCallandvisitById(id);
        mmap.put("callandvisit", callandvisit);
        return prefix + "/edit";
    }

    /**
     * 修改保存来电来访情况
     */
    @RequiresPermissions("system:callandvisit:edit")
    @Log(title = "来电来访情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Callandvisit callandvisit)
    {
        return toAjax(callandvisitService.updateCallandvisit(callandvisit));
    }

    /**
     * 删除来电来访情况
     */
    @RequiresPermissions("system:callandvisit:remove")
    @Log(title = "来电来访情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(callandvisitService.deleteCallandvisitByIds(ids));
    }
}
