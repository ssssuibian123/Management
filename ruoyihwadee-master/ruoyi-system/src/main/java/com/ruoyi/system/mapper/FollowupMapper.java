package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Followup;

/**
 * 跟进情况Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface FollowupMapper 
{
    /**
     * 查询跟进情况
     * 
     * @param id 跟进情况ID
     * @return 跟进情况
     */
    public Followup selectFollowupById(Integer id);

    /**
     * 查询跟进情况列表
     * 
     * @param followup 跟进情况
     * @return 跟进情况集合
     */
    public List<Followup> selectFollowupList(Followup followup);

    /**
     * 新增跟进情况
     * 
     * @param followup 跟进情况
     * @return 结果
     */
    public int insertFollowup(Followup followup);

    /**
     * 修改跟进情况
     * 
     * @param followup 跟进情况
     * @return 结果
     */
    public int updateFollowup(Followup followup);

    /**
     * 删除跟进情况
     * 
     * @param id 跟进情况ID
     * @return 结果
     */
    public int deleteFollowupById(Integer id);

    /**
     * 批量删除跟进情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFollowupByIds(String[] ids);
}
