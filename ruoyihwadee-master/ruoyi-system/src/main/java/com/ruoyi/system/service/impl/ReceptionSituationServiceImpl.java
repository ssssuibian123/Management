package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ReceptionSituationMapper;
import com.ruoyi.system.domain.ReceptionSituation;
import com.ruoyi.system.service.IReceptionSituationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 接待情况Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class ReceptionSituationServiceImpl implements IReceptionSituationService 
{
    @Autowired
    private ReceptionSituationMapper receptionSituationMapper;

    /**
     * 查询接待情况
     * 
     * @param id 接待情况ID
     * @return 接待情况
     */
    @Override
    public ReceptionSituation selectReceptionSituationById(Integer id)
    {
        return receptionSituationMapper.selectReceptionSituationById(id);
    }

    /**
     * 查询接待情况列表
     * 
     * @param receptionSituation 接待情况
     * @return 接待情况
     */
    @Override
    public List<ReceptionSituation> selectReceptionSituationList(ReceptionSituation receptionSituation)
    {
        return receptionSituationMapper.selectReceptionSituationList(receptionSituation);
    }

    /**
     * 新增接待情况
     * 
     * @param receptionSituation 接待情况
     * @return 结果
     */
    @Override
    public int insertReceptionSituation(ReceptionSituation receptionSituation)
    {
        return receptionSituationMapper.insertReceptionSituation(receptionSituation);
    }

    /**
     * 修改接待情况
     * 
     * @param receptionSituation 接待情况
     * @return 结果
     */
    @Override
    public int updateReceptionSituation(ReceptionSituation receptionSituation)
    {
        return receptionSituationMapper.updateReceptionSituation(receptionSituation);
    }

    /**
     * 删除接待情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteReceptionSituationByIds(String ids)
    {
        return receptionSituationMapper.deleteReceptionSituationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除接待情况信息
     * 
     * @param id 接待情况ID
     * @return 结果
     */
    @Override
    public int deleteReceptionSituationById(Integer id)
    {
        return receptionSituationMapper.deleteReceptionSituationById(id);
    }
}
