package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerCareMapper;
import com.ruoyi.system.domain.CustomerCare;
import com.ruoyi.system.service.ICustomerCareService;
import com.ruoyi.common.core.text.Convert;

/**
 * CustomerCareService业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class CustomerCareServiceImpl implements ICustomerCareService 
{
    @Autowired
    private CustomerCareMapper customerCareMapper;

    /**
     * 查询CustomerCare
     * 
     * @param id CustomerCareID
     * @return CustomerCare
     */
    @Override
    public CustomerCare selectCustomerCareById(Long id)
    {
        return customerCareMapper.selectCustomerCareById(id);
    }

    /**
     * 查询CustomerCare列表
     * 
     * @param customerCare CustomerCare
     * @return CustomerCare
     */
    @Override
    public List<CustomerCare> selectCustomerCareList(CustomerCare customerCare)
    {
        return customerCareMapper.selectCustomerCareList(customerCare);
    }

    /**
     * 新增CustomerCare
     * 
     * @param customerCare CustomerCare
     * @return 结果
     */
    @Override
    public int insertCustomerCare(CustomerCare customerCare)
    {
        return customerCareMapper.insertCustomerCare(customerCare);
    }

    /**
     * 修改CustomerCare
     * 
     * @param customerCare CustomerCare
     * @return 结果
     */
    @Override
    public int updateCustomerCare(CustomerCare customerCare)
    {
        return customerCareMapper.updateCustomerCare(customerCare);
    }

    /**
     * 删除CustomerCare对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCustomerCareByIds(String ids)
    {
        return customerCareMapper.deleteCustomerCareByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除CustomerCare信息
     * 
     * @param id CustomerCareID
     * @return 结果
     */
    @Override
    public int deleteCustomerCareById(Long id)
    {
        return customerCareMapper.deleteCustomerCareById(id);
    }
}
