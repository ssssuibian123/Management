package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Attendance;

/**
 * 签到情况Mapper接口
 * 
 * @author ruoyi
 * @date 2021-06-22
 */
public interface AttendanceMapper 
{
    /**
     * 查询签到情况
     * 
     * @param name 签到情况ID
     * @return 签到情况
     */
    public Attendance selectAttendanceById(String name);

    /**
     * 查询签到情况列表
     * 
     * @param attendance 签到情况
     * @return 签到情况集合
     */
    public List<Attendance> selectAttendanceList(Attendance attendance);

    /**
     * 新增签到情况
     * 
     * @param attendance 签到情况
     * @return 结果
     */
    public int insertAttendance(Attendance attendance);

    /**
     * 修改签到情况
     * 
     * @param attendance 签到情况
     * @return 结果
     */
    public int updateAttendance(Attendance attendance);

    /**
     * 删除签到情况
     * 
     * @param name 签到情况ID
     * @return 结果
     */
    public int deleteAttendanceById(String name);

    /**
     * 批量删除签到情况
     * 
     * @param names 需要删除的数据ID
     * @return 结果
     */
    public int deleteAttendanceByIds(String[] names);

    /**
     * 得到签到情况列表
     * @return 结果
     */
    public List<Attendance> getAttendanceList ();

    /**
     * 得到group签到情况列表
     * @return 结果
     */
    public List<Attendance> getGroupAttendanceList();

    /**
     * 得到Stu签到情况列表
     * @return 结果
     */
    public List<Attendance> getStuAttendanceList();
}
