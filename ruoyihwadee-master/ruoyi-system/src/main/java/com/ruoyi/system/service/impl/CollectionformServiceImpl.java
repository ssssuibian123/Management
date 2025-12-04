package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CollectionformMapper;
import com.ruoyi.system.domain.Collectionform;
import com.ruoyi.system.service.ICollectionformService;
import com.ruoyi.common.core.text.Convert;

/**
 * 收款表Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class CollectionformServiceImpl implements ICollectionformService 
{
    @Autowired
    private CollectionformMapper collectionformMapper;

    /**
     * 查询收款表
     * 
     * @param contractId 收款表ID
     * @return 收款表
     */
    @Override
    public Collectionform selectCollectionformById(String contractId)
    {
        return collectionformMapper.selectCollectionformById(contractId);
    }

    /**
     * 查询收款表列表
     * 
     * @param collectionform 收款表
     * @return 收款表
     */
    @Override
    public List<Collectionform> selectCollectionformList(Collectionform collectionform)
    {
        return collectionformMapper.selectCollectionformList(collectionform);
    }

    /**
     * 新增收款表
     * 
     * @param collectionform 收款表
     * @return 结果
     */
    @Override
    public int insertCollectionform(Collectionform collectionform)
    {
        return collectionformMapper.insertCollectionform(collectionform);
    }

    /**
     * 修改收款表
     * 
     * @param collectionform 收款表
     * @return 结果
     */
    @Override
    public int updateCollectionform(Collectionform collectionform)
    {
        return collectionformMapper.updateCollectionform(collectionform);
    }

    /**
     * 删除收款表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCollectionformByIds(String ids)
    {
        return collectionformMapper.deleteCollectionformByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除收款表信息
     * 
     * @param contractId 收款表ID
     * @return 结果
     */
    @Override
    public int deleteCollectionformById(String contractId)
    {
        return collectionformMapper.deleteCollectionformById(contractId);
    }
}
