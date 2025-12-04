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
import com.ruoyi.system.domain.Attendance;
import com.ruoyi.system.service.IAttendanceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 签到情况Controller
 * 
 * @author ruoyi
 * @date 2021-06-22
 */
@Controller
@RequestMapping("/system/attendance")
public class AttendanceController extends BaseController
{
    private String prefix = "system/attendance";

    @Autowired
    private IAttendanceService attendanceService;

    @RequiresPermissions("system:attendance:view")
    @GetMapping()
    public String attendance()
    {
        return prefix + "/attendance";
    }
    /**
     * 得到全部的查询数据
     */
    @GetMapping("/getAttendanceList")
    @ResponseBody
    public List<Attendance> getAttendanceList( ) {
        return attendanceService.getAttendanceList();
    }
    /**
     * 得到group的全部查询数据
     * public List<Attendance> getGroupAttendanceList();
     */
    @GetMapping("/getGroupAttendanceList")
    @ResponseBody
    public List<Attendance> getGroupAttendanceList() {
        return attendanceService.getGroupAttendanceList();
    }
    /**
     * 得到Stu的全部查询数据
     * public List<Attendance> getGroupAttendanceList();
     */
    @GetMapping("/getStuAttendanceList")
    @ResponseBody
    public List<Attendance> getStuAttendanceList() {
        return attendanceService.getStuAttendanceList();
    }
    /**
     * 查询签到情况列表
     */
    @RequiresPermissions("system:attendance:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Attendance attendance)
    {
        startPage();
        List<Attendance> list = attendanceService.selectAttendanceList(attendance);
        return getDataTable(list);
    }

    /**
     * 导出签到情况列表
     */
    @RequiresPermissions("system:attendance:export")
    @Log(title = "签到情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Attendance attendance)
    {
        List<Attendance> list = attendanceService.selectAttendanceList(attendance);
        ExcelUtil<Attendance> util = new ExcelUtil<Attendance>(Attendance.class);
        return util.exportExcel(list, "签到情况数据");
    }

    /**
     * 新增签到情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存签到情况
     */
    @RequiresPermissions("system:attendance:add")
    @Log(title = "签到情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Attendance attendance)
    {
        return toAjax(attendanceService.insertAttendance(attendance));
    }

    /**
     * 修改签到情况
     */
    @GetMapping("/edit/{name}")
    public String edit(@PathVariable("name") String name, ModelMap mmap)
    {
        Attendance attendance = attendanceService.selectAttendanceById(name);
        mmap.put("attendance", attendance);
        return prefix + "/edit";
    }

    /**
     * 修改保存签到情况
     */
    @RequiresPermissions("system:attendance:edit")
    @Log(title = "签到情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Attendance attendance)
    {
        return toAjax(attendanceService.updateAttendance(attendance));
    }

    /**
     * 删除签到情况
     */
    @RequiresPermissions("system:attendance:remove")
    @Log(title = "签到情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(attendanceService.deleteAttendanceByIds(ids));
    }
}
