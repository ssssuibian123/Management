package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Attendance;

/**
 * 签到情况Service接口
 * 
 * @author ruoyi
 * @date 2021-06-22
 */
public interface IAttendanceService 
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
     * 批量删除签到情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAttendanceByIds(String ids);

    /**
     * 删除签到情况信息
     * 
     * @param name 签到情况ID
     * @return 结果
     */
    public int deleteAttendanceById(String name);

    /**
     * 获取签到情况列表
     * @return 签到情况集合
     */
    public List<Attendance> getAttendanceList();
    /**
     * 得到某个学生， 最近七天的签到数量、请假数量、迟到数量
     */
    public List<Attendance> getGroupAttendanceList();

    public List<Attendance> getStuAttendanceList();
}
