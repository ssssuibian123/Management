package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Collectionform;

/**
 * 收款表Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface ICollectionformService 
{
    /**
     * 查询收款表
     * 
     * @param contractId 收款表ID
     * @return 收款表
     */
    public Collectionform selectCollectionformById(String contractId);

    /**
     * 查询收款表列表
     * 
     * @param collectionform 收款表
     * @return 收款表集合
     */
    public List<Collectionform> selectCollectionformList(Collectionform collectionform);

    /**
     * 新增收款表
     * 
     * @param collectionform 收款表
     * @return 结果
     */
    public int insertCollectionform(Collectionform collectionform);

    /**
     * 修改收款表
     * 
     * @param collectionform 收款表
     * @return 结果
     */
    public int updateCollectionform(Collectionform collectionform);

    /**
     * 批量删除收款表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCollectionformByIds(String ids);

    /**
     * 删除收款表信息
     * 
     * @param contractId 收款表ID
     * @return 结果
     */
    public int deleteCollectionformById(String contractId);
}
