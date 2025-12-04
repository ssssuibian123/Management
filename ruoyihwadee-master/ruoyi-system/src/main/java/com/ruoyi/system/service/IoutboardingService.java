package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.outboarding;

/**
 * 离职界面Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface IoutboardingService 
{
    /**
     * 查询离职界面
     * 
     * @param onboardingId 离职界面ID
     * @return 离职界面
     */
    public outboarding selectoutboardingById(Long onboardingId);

    /**
     * 查询离职界面列表
     * 
     * @param outboarding 离职界面
     * @return 离职界面集合
     */
    public List<outboarding> selectoutboardingList(outboarding outboarding);

    /**
     * 新增离职界面
     * 
     * @param outboarding 离职界面
     * @return 结果
     */
    public int insertoutboarding(outboarding outboarding);

    /**
     * 修改离职界面
     * 
     * @param outboarding 离职界面
     * @return 结果
     */
    public int updateoutboarding(outboarding outboarding);

    /**
     * 批量删除离职界面
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteoutboardingByIds(String ids);

    /**
     * 删除离职界面信息
     * 
     * @param onboardingId 离职界面ID
     * @return 结果
     */
    public int deleteoutboardingById(Long onboardingId);
}
