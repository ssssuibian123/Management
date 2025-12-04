package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Contractinformation;

/**
 * 合同信息表Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface IContractinformationService 
{
    /**
     * 查询合同信息表
     * 
     * @param id 合同信息表ID
     * @return 合同信息表
     */
    public Contractinformation selectContractinformationById(Integer id);

    /**
     * 查询合同信息表列表
     * 
     * @param contractinformation 合同信息表
     * @return 合同信息表集合
     */
    public List<Contractinformation> selectContractinformationList(Contractinformation contractinformation);

    /**
     * 新增合同信息表
     * 
     * @param contractinformation 合同信息表
     * @return 结果
     */
    public int insertContractinformation(Contractinformation contractinformation);

    /**
     * 修改合同信息表
     * 
     * @param contractinformation 合同信息表
     * @return 结果
     */
    public int updateContractinformation(Contractinformation contractinformation);

    /**
     * 批量删除合同信息表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteContractinformationByIds(String ids);

    /**
     * 删除合同信息表信息
     * 
     * @param id 合同信息表ID
     * @return 结果
     */
    public int deleteContractinformationById(Integer id);
}
