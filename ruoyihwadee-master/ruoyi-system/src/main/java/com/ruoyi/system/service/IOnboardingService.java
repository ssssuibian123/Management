package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Onboarding;

/**
 * 入职界面Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface IOnboardingService 
{
    /**
     * 查询入职界面
     * 
     * @param onboardingId 入职界面ID
     * @return 入职界面
     */
    public Onboarding selectOnboardingById(Long onboardingId);

    /**
     * 查询入职界面列表
     * 
     * @param onboarding 入职界面
     * @return 入职界面集合
     */
    public List<Onboarding> selectOnboardingList(Onboarding onboarding);

    /**
     * 新增入职界面
     * 
     * @param onboarding 入职界面
     * @return 结果
     */
    public int insertOnboarding(Onboarding onboarding);

    /**
     * 修改入职界面
     * 
     * @param onboarding 入职界面
     * @return 结果
     */
    public int updateOnboarding(Onboarding onboarding);

    /**
     * 批量删除入职界面
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOnboardingByIds(String ids);

    /**
     * 删除入职界面信息
     * 
     * @param onboardingId 入职界面ID
     * @return 结果
     */
    public int deleteOnboardingById(Long onboardingId);
}
