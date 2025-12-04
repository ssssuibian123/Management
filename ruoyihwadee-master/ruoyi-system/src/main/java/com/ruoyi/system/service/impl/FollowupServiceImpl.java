package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FollowupMapper;
import com.ruoyi.system.domain.Followup;
import com.ruoyi.system.service.IFollowupService;
import com.ruoyi.common.core.text.Convert;

/**
 * 跟进情况Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class FollowupServiceImpl implements IFollowupService 
{
    @Autowired
    private FollowupMapper followupMapper;

    /**
     * 查询跟进情况
     * 
     * @param id 跟进情况ID
     * @return 跟进情况
     */
    @Override
    public Followup selectFollowupById(Integer id)
    {
        return followupMapper.selectFollowupById(id);
    }

    /**
     * 查询跟进情况列表
     * 
     * @param followup 跟进情况
     * @return 跟进情况
     */
    @Override
    public List<Followup> selectFollowupList(Followup followup)
    {
        return followupMapper.selectFollowupList(followup);
    }

    /**
     * 新增跟进情况
     * 
     * @param followup 跟进情况
     * @return 结果
     */
    @Override
    public int insertFollowup(Followup followup)
    {
        return followupMapper.insertFollowup(followup);
    }

    /**
     * 修改跟进情况
     * 
     * @param followup 跟进情况
     * @return 结果
     */
    @Override
    public int updateFollowup(Followup followup)
    {
        return followupMapper.updateFollowup(followup);
    }

    /**
     * 删除跟进情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFollowupByIds(String ids)
    {
        return followupMapper.deleteFollowupByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除跟进情况信息
     * 
     * @param id 跟进情况ID
     * @return 结果
     */
    @Override
    public int deleteFollowupById(Integer id)
    {
        return followupMapper.deleteFollowupById(id);
    }
}
