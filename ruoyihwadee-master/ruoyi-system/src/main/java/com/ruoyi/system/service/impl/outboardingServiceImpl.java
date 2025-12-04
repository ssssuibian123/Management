package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.outboardingMapper;
import com.ruoyi.system.domain.outboarding;
import com.ruoyi.system.service.IoutboardingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 离职界面Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class outboardingServiceImpl implements IoutboardingService 
{
    @Autowired
    private outboardingMapper outboardingMapper;

    /**
     * 查询离职界面
     * 
     * @param onboardingId 离职界面ID
     * @return 离职界面
     */
    @Override
    public outboarding selectoutboardingById(Long onboardingId)
    {
        return outboardingMapper.selectoutboardingById(onboardingId);
    }

    /**
     * 查询离职界面列表
     * 
     * @param outboarding 离职界面
     * @return 离职界面
     */
    @Override
    public List<outboarding> selectoutboardingList(outboarding outboarding)
    {
        return outboardingMapper.selectoutboardingList(outboarding);
    }

    /**
     * 新增离职界面
     * 
     * @param outboarding 离职界面
     * @return 结果
     */
    @Override
    public int insertoutboarding(outboarding outboarding)
    {
        return outboardingMapper.insertoutboarding(outboarding);
    }

    /**
     * 修改离职界面
     * 
     * @param outboarding 离职界面
     * @return 结果
     */
    @Override
    public int updateoutboarding(outboarding outboarding)
    {
        return outboardingMapper.updateoutboarding(outboarding);
    }

    /**
     * 删除离职界面对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteoutboardingByIds(String ids)
    {
        return outboardingMapper.deleteoutboardingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除离职界面信息
     * 
     * @param onboardingId 离职界面ID
     * @return 结果
     */
    @Override
    public int deleteoutboardingById(Long onboardingId)
    {
        return outboardingMapper.deleteoutboardingById(onboardingId);
    }
}
