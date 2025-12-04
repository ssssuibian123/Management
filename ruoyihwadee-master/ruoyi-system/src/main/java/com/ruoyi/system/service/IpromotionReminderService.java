package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.promotionReminder;

/**
 * 晋升提醒Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface IpromotionReminderService 
{
    /**
     * 查询晋升提醒
     * 
     * @param id 晋升提醒ID
     * @return 晋升提醒
     */
    public promotionReminder selectpromotionReminderById(Long id);

    /**
     * 查询晋升提醒列表
     * 
     * @param promotionReminder 晋升提醒
     * @return 晋升提醒集合
     */
    public List<promotionReminder> selectpromotionReminderList(promotionReminder promotionReminder);

    /**
     * 新增晋升提醒
     * 
     * @param promotionReminder 晋升提醒
     * @return 结果
     */
    public int insertpromotionReminder(promotionReminder promotionReminder);

    /**
     * 修改晋升提醒
     * 
     * @param promotionReminder 晋升提醒
     * @return 结果
     */
    public int updatepromotionReminder(promotionReminder promotionReminder);

    /**
     * 批量删除晋升提醒
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletepromotionReminderByIds(String ids);

    /**
     * 删除晋升提醒信息
     * 
     * @param id 晋升提醒ID
     * @return 结果
     */
    public int deletepromotionReminderById(Long id);
}
