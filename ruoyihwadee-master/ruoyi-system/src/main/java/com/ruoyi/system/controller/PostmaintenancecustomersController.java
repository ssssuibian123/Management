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
import com.ruoyi.system.domain.Postmaintenancecustomers;
import com.ruoyi.system.service.IPostmaintenancecustomersService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 后期维护客户表Controller
 * 
 * @author aower
 * @date 2022-02-17
 */
@Controller
@RequestMapping("/system/postmaintenancecustomers")
public class PostmaintenancecustomersController extends BaseController
{
    private String prefix = "system/postmaintenancecustomers";

    @Autowired
    private IPostmaintenancecustomersService postmaintenancecustomersService;

    @RequiresPermissions("system:postmaintenancecustomers:view")
    @GetMapping()
    public String postmaintenancecustomers()
    {
        return prefix + "/postmaintenancecustomers";
    }

    /**
     * 查询后期维护客户表列表
     */
    @RequiresPermissions("system:postmaintenancecustomers:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Postmaintenancecustomers postmaintenancecustomers)
    {
        startPage();
        List<Postmaintenancecustomers> list = postmaintenancecustomersService.selectPostmaintenancecustomersList(postmaintenancecustomers);
        return getDataTable(list);
    }

    /**
     * 导出后期维护客户表列表
     */
    @RequiresPermissions("system:postmaintenancecustomers:export")
    @Log(title = "后期维护客户表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Postmaintenancecustomers postmaintenancecustomers)
    {
        List<Postmaintenancecustomers> list = postmaintenancecustomersService.selectPostmaintenancecustomersList(postmaintenancecustomers);
        ExcelUtil<Postmaintenancecustomers> util = new ExcelUtil<Postmaintenancecustomers>(Postmaintenancecustomers.class);
        return util.exportExcel(list, "后期维护客户表数据");
    }

    /**
     * 新增后期维护客户表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存后期维护客户表
     */
    @RequiresPermissions("system:postmaintenancecustomers:add")
    @Log(title = "后期维护客户表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Postmaintenancecustomers postmaintenancecustomers)
    {
        return toAjax(postmaintenancecustomersService.insertPostmaintenancecustomers(postmaintenancecustomers));
    }

    /**
     * 修改后期维护客户表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Postmaintenancecustomers postmaintenancecustomers = postmaintenancecustomersService.selectPostmaintenancecustomersById(id);
        mmap.put("postmaintenancecustomers", postmaintenancecustomers);
        return prefix + "/edit";
    }

    /**
     * 修改保存后期维护客户表
     */
    @RequiresPermissions("system:postmaintenancecustomers:edit")
    @Log(title = "后期维护客户表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Postmaintenancecustomers postmaintenancecustomers)
    {
        return toAjax(postmaintenancecustomersService.updatePostmaintenancecustomers(postmaintenancecustomers));
    }

    /**
     * 删除后期维护客户表
     */
    @RequiresPermissions("system:postmaintenancecustomers:remove")
    @Log(title = "后期维护客户表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(postmaintenancecustomersService.deletePostmaintenancecustomersByIds(ids));
    }
}
