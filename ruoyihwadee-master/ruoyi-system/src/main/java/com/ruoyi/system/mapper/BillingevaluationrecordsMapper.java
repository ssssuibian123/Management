package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Billingevaluationrecords;

/**
 * 结算与评价记录Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface BillingevaluationrecordsMapper 
{
    /**
     * 查询结算与评价记录
     * 
     * @param id 结算与评价记录ID
     * @return 结算与评价记录
     */
    public Billingevaluationrecords selectBillingevaluationrecordsById(Long id);

    /**
     * 查询结算与评价记录列表
     * 
     * @param billingevaluationrecords 结算与评价记录
     * @return 结算与评价记录集合
     */
    public List<Billingevaluationrecords> selectBillingevaluationrecordsList(Billingevaluationrecords billingevaluationrecords);

    /**
     * 新增结算与评价记录
     * 
     * @param billingevaluationrecords 结算与评价记录
     * @return 结果
     */
    public int insertBillingevaluationrecords(Billingevaluationrecords billingevaluationrecords);

    /**
     * 修改结算与评价记录
     * 
     * @param billingevaluationrecords 结算与评价记录
     * @return 结果
     */
    public int updateBillingevaluationrecords(Billingevaluationrecords billingevaluationrecords);

    /**
     * 删除结算与评价记录
     * 
     * @param id 结算与评价记录ID
     * @return 结果
     */
    public int deleteBillingevaluationrecordsById(Long id);

    /**
     * 批量删除结算与评价记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBillingevaluationrecordsByIds(String[] ids);
}
