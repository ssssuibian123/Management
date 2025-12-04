package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OnboardingMapper;
import com.ruoyi.system.domain.Onboarding;
import com.ruoyi.system.service.IOnboardingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 入职界面Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class OnboardingServiceImpl implements IOnboardingService 
{
    @Autowired
    private OnboardingMapper onboardingMapper;

    /**
     * 查询入职界面
     * 
     * @param onboardingId 入职界面ID
     * @return 入职界面
     */
    @Override
    public Onboarding selectOnboardingById(Long onboardingId)
    {
        return onboardingMapper.selectOnboardingById(onboardingId);
    }

    /**
     * 查询入职界面列表
     * 
     * @param onboarding 入职界面
     * @return 入职界面
     */
    @Override
    public List<Onboarding> selectOnboardingList(Onboarding onboarding)
    {
        return onboardingMapper.selectOnboardingList(onboarding);
    }

    /**
     * 新增入职界面
     * 
     * @param onboarding 入职界面
     * @return 结果
     */
    @Override
    public int insertOnboarding(Onboarding onboarding)
    {
        return onboardingMapper.insertOnboarding(onboarding);
    }

    /**
     * 修改入职界面
     * 
     * @param onboarding 入职界面
     * @return 结果
     */
    @Override
    public int updateOnboarding(Onboarding onboarding)
    {
        return onboardingMapper.updateOnboarding(onboarding);
    }

    /**
     * 删除入职界面对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOnboardingByIds(String ids)
    {
        return onboardingMapper.deleteOnboardingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除入职界面信息
     * 
     * @param onboardingId 入职界面ID
     * @return 结果
     */
    @Override
    public int deleteOnboardingById(Long onboardingId)
    {
        return onboardingMapper.deleteOnboardingById(onboardingId);
    }
}
