package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerfollowrecordsMapper;
import com.ruoyi.system.domain.Customerfollowrecords;
import com.ruoyi.system.service.ICustomerfollowrecordsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户跟进记录Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class CustomerfollowrecordsServiceImpl implements ICustomerfollowrecordsService 
{
    @Autowired
    private CustomerfollowrecordsMapper customerfollowrecordsMapper;

    /**
     * 查询客户跟进记录
     * 
     * @param id 客户跟进记录ID
     * @return 客户跟进记录
     */
    @Override
    public Customerfollowrecords selectCustomerfollowrecordsById(Long id)
    {
        return customerfollowrecordsMapper.selectCustomerfollowrecordsById(id);
    }

    /**
     * 查询客户跟进记录列表
     * 
     * @param customerfollowrecords 客户跟进记录
     * @return 客户跟进记录
     */
    @Override
    public List<Customerfollowrecords> selectCustomerfollowrecordsList(Customerfollowrecords customerfollowrecords)
    {
        return customerfollowrecordsMapper.selectCustomerfollowrecordsList(customerfollowrecords);
    }

    /**
     * 新增客户跟进记录
     * 
     * @param customerfollowrecords 客户跟进记录
     * @return 结果
     */
    @Override
    public int insertCustomerfollowrecords(Customerfollowrecords customerfollowrecords)
    {
        return customerfollowrecordsMapper.insertCustomerfollowrecords(customerfollowrecords);
    }

    /**
     * 修改客户跟进记录
     * 
     * @param customerfollowrecords 客户跟进记录
     * @return 结果
     */
    @Override
    public int updateCustomerfollowrecords(Customerfollowrecords customerfollowrecords)
    {
        return customerfollowrecordsMapper.updateCustomerfollowrecords(customerfollowrecords);
    }

    /**
     * 删除客户跟进记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCustomerfollowrecordsByIds(String ids)
    {
        return customerfollowrecordsMapper.deleteCustomerfollowrecordsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户跟进记录信息
     * 
     * @param id 客户跟进记录ID
     * @return 结果
     */
    @Override
    public int deleteCustomerfollowrecordsById(Long id)
    {
        return customerfollowrecordsMapper.deleteCustomerfollowrecordsById(id);
    }
}
