package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.promotionReminderMapper;
import com.ruoyi.system.domain.promotionReminder;
import com.ruoyi.system.service.IpromotionReminderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 晋升提醒Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class promotionReminderServiceImpl implements IpromotionReminderService 
{
    @Autowired
    private promotionReminderMapper promotionReminderMapper;

    /**
     * 查询晋升提醒
     * 
     * @param id 晋升提醒ID
     * @return 晋升提醒
     */
    @Override
    public promotionReminder selectpromotionReminderById(Long id)
    {
        return promotionReminderMapper.selectpromotionReminderById(id);
    }

    /**
     * 查询晋升提醒列表
     * 
     * @param promotionReminder 晋升提醒
     * @return 晋升提醒
     */
    @Override
    public List<promotionReminder> selectpromotionReminderList(promotionReminder promotionReminder)
    {
        return promotionReminderMapper.selectpromotionReminderList(promotionReminder);
    }

    /**
     * 新增晋升提醒
     * 
     * @param promotionReminder 晋升提醒
     * @return 结果
     */
    @Override
    public int insertpromotionReminder(promotionReminder promotionReminder)
    {
        return promotionReminderMapper.insertpromotionReminder(promotionReminder);
    }

    /**
     * 修改晋升提醒
     * 
     * @param promotionReminder 晋升提醒
     * @return 结果
     */
    @Override
    public int updatepromotionReminder(promotionReminder promotionReminder)
    {
        return promotionReminderMapper.updatepromotionReminder(promotionReminder);
    }

    /**
     * 删除晋升提醒对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletepromotionReminderByIds(String ids)
    {
        return promotionReminderMapper.deletepromotionReminderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除晋升提醒信息
     * 
     * @param id 晋升提醒ID
     * @return 结果
     */
    @Override
    public int deletepromotionReminderById(Long id)
    {
        return promotionReminderMapper.deletepromotionReminderById(id);
    }
}
