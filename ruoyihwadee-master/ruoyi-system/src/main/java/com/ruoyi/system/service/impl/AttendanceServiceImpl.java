package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AttendanceMapper;
import com.ruoyi.system.domain.Attendance;
import com.ruoyi.system.service.IAttendanceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 签到情况Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-06-22
 */
@Service
public class AttendanceServiceImpl implements IAttendanceService 
{
    @Autowired
    private AttendanceMapper attendanceMapper;

    /**
     * 查询签到情况
     * 
     * @param name 签到情况ID
     * @return 签到情况
     */
    @Override
    public Attendance selectAttendanceById(String name)
    {
        return attendanceMapper.selectAttendanceById(name);
    }

    /**
     * 查询签到情况列表
     * 
     * @param attendance 签到情况
     * @return 签到情况
     */
    @Override
    public List<Attendance> selectAttendanceList(Attendance attendance)
    {
        return attendanceMapper.selectAttendanceList(attendance);
    }

    /**
     * 新增签到情况
     * 
     * @param attendance 签到情况
     * @return 结果
     */
    @Override
    public int insertAttendance(Attendance attendance)
    {
        return attendanceMapper.insertAttendance(attendance);
    }

    /**
     * 修改签到情况
     * 
     * @param attendance 签到情况
     * @return 结果
     */
    @Override
    public int updateAttendance(Attendance attendance)
    {
        return attendanceMapper.updateAttendance(attendance);
    }

    /**
     * 删除签到情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAttendanceByIds(String ids)
    {
        return attendanceMapper.deleteAttendanceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除签到情况信息
     * 
     * @param name 签到情况ID
     * @return 结果
     */
    @Override
    public int deleteAttendanceById(String name)
    {
        return attendanceMapper.deleteAttendanceById(name);
    }

    @Override
    public List<Attendance> getAttendanceList() {
        return attendanceMapper.getAttendanceList();
    }

    @Override
    public List<Attendance> getGroupAttendanceList() {
        return attendanceMapper.getGroupAttendanceList();
    }

    @Override
    public List<Attendance> getStuAttendanceList() {
        return attendanceMapper.getStuAttendanceList();
    }
}
