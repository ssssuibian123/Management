package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ContractinformationMapper;
import com.ruoyi.system.domain.Contractinformation;
import com.ruoyi.system.service.IContractinformationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 合同信息表Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class ContractinformationServiceImpl implements IContractinformationService 
{
    @Autowired
    private ContractinformationMapper contractinformationMapper;

    /**
     * 查询合同信息表
     * 
     * @param id 合同信息表ID
     * @return 合同信息表
     */
    @Override
    public Contractinformation selectContractinformationById(Integer id)
    {
        return contractinformationMapper.selectContractinformationById(id);
    }

    /**
     * 查询合同信息表列表
     * 
     * @param contractinformation 合同信息表
     * @return 合同信息表
     */
    @Override
    public List<Contractinformation> selectContractinformationList(Contractinformation contractinformation)
    {
        return contractinformationMapper.selectContractinformationList(contractinformation);
    }

    /**
     * 新增合同信息表
     * 
     * @param contractinformation 合同信息表
     * @return 结果
     */
    @Override
    public int insertContractinformation(Contractinformation contractinformation)
    {
        return contractinformationMapper.insertContractinformation(contractinformation);
    }

    /**
     * 修改合同信息表
     * 
     * @param contractinformation 合同信息表
     * @return 结果
     */
    @Override
    public int updateContractinformation(Contractinformation contractinformation)
    {
        return contractinformationMapper.updateContractinformation(contractinformation);
    }

    /**
     * 删除合同信息表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteContractinformationByIds(String ids)
    {
        return contractinformationMapper.deleteContractinformationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除合同信息表信息
     * 
     * @param id 合同信息表ID
     * @return 结果
     */
    @Override
    public int deleteContractinformationById(Integer id)
    {
        return contractinformationMapper.deleteContractinformationById(id);
    }
}
