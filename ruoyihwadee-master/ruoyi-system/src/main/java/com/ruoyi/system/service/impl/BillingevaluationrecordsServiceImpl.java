package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BillingevaluationrecordsMapper;
import com.ruoyi.system.domain.Billingevaluationrecords;
import com.ruoyi.system.service.IBillingevaluationrecordsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 结算与评价记录Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class BillingevaluationrecordsServiceImpl implements IBillingevaluationrecordsService 
{
    @Autowired
    private BillingevaluationrecordsMapper billingevaluationrecordsMapper;

    /**
     * 查询结算与评价记录
     * 
     * @param id 结算与评价记录ID
     * @return 结算与评价记录
     */
    @Override
    public Billingevaluationrecords selectBillingevaluationrecordsById(Long id)
    {
        return billingevaluationrecordsMapper.selectBillingevaluationrecordsById(id);
    }

    /**
     * 查询结算与评价记录列表
     * 
     * @param billingevaluationrecords 结算与评价记录
     * @return 结算与评价记录
     */
    @Override
    public List<Billingevaluationrecords> selectBillingevaluationrecordsList(Billingevaluationrecords billingevaluationrecords)
    {
        return billingevaluationrecordsMapper.selectBillingevaluationrecordsList(billingevaluationrecords);
    }

    /**
     * 新增结算与评价记录
     * 
     * @param billingevaluationrecords 结算与评价记录
     * @return 结果
     */
    @Override
    public int insertBillingevaluationrecords(Billingevaluationrecords billingevaluationrecords)
    {
        return billingevaluationrecordsMapper.insertBillingevaluationrecords(billingevaluationrecords);
    }

    /**
     * 修改结算与评价记录
     * 
     * @param billingevaluationrecords 结算与评价记录
     * @return 结果
     */
    @Override
    public int updateBillingevaluationrecords(Billingevaluationrecords billingevaluationrecords)
    {
        return billingevaluationrecordsMapper.updateBillingevaluationrecords(billingevaluationrecords);
    }

    /**
     * 删除结算与评价记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBillingevaluationrecordsByIds(String ids)
    {
        return billingevaluationrecordsMapper.deleteBillingevaluationrecordsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除结算与评价记录信息
     * 
     * @param id 结算与评价记录ID
     * @return 结果
     */
    @Override
    public int deleteBillingevaluationrecordsById(Long id)
    {
        return billingevaluationrecordsMapper.deleteBillingevaluationrecordsById(id);
    }
}
