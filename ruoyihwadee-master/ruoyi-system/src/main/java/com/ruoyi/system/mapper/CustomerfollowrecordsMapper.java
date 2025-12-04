package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Customerfollowrecords;

/**
 * 客户跟进记录Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface CustomerfollowrecordsMapper 
{
    /**
     * 查询客户跟进记录
     * 
     * @param id 客户跟进记录ID
     * @return 客户跟进记录
     */
    public Customerfollowrecords selectCustomerfollowrecordsById(Long id);

    /**
     * 查询客户跟进记录列表
     * 
     * @param customerfollowrecords 客户跟进记录
     * @return 客户跟进记录集合
     */
    public List<Customerfollowrecords> selectCustomerfollowrecordsList(Customerfollowrecords customerfollowrecords);

    /**
     * 新增客户跟进记录
     * 
     * @param customerfollowrecords 客户跟进记录
     * @return 结果
     */
    public int insertCustomerfollowrecords(Customerfollowrecords customerfollowrecords);

    /**
     * 修改客户跟进记录
     * 
     * @param customerfollowrecords 客户跟进记录
     * @return 结果
     */
    public int updateCustomerfollowrecords(Customerfollowrecords customerfollowrecords);

    /**
     * 删除客户跟进记录
     * 
     * @param id 客户跟进记录ID
     * @return 结果
     */
    public int deleteCustomerfollowrecordsById(Long id);

    /**
     * 批量删除客户跟进记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCustomerfollowrecordsByIds(String[] ids);
}
