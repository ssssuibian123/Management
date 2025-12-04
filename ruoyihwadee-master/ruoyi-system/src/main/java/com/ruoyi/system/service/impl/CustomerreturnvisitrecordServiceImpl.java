package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerreturnvisitrecordMapper;
import com.ruoyi.system.domain.Customerreturnvisitrecord;
import com.ruoyi.system.service.ICustomerreturnvisitrecordService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户回访记录Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class CustomerreturnvisitrecordServiceImpl implements ICustomerreturnvisitrecordService 
{
    @Autowired
    private CustomerreturnvisitrecordMapper customerreturnvisitrecordMapper;

    /**
     * 查询客户回访记录
     * 
     * @param id 客户回访记录ID
     * @return 客户回访记录
     */
    @Override
    public Customerreturnvisitrecord selectCustomerreturnvisitrecordById(Integer id)
    {
        return customerreturnvisitrecordMapper.selectCustomerreturnvisitrecordById(id);
    }

    /**
     * 查询客户回访记录列表
     * 
     * @param customerreturnvisitrecord 客户回访记录
     * @return 客户回访记录
     */
    @Override
    public List<Customerreturnvisitrecord> selectCustomerreturnvisitrecordList(Customerreturnvisitrecord customerreturnvisitrecord)
    {
        return customerreturnvisitrecordMapper.selectCustomerreturnvisitrecordList(customerreturnvisitrecord);
    }

    /**
     * 新增客户回访记录
     * 
     * @param customerreturnvisitrecord 客户回访记录
     * @return 结果
     */
    @Override
    public int insertCustomerreturnvisitrecord(Customerreturnvisitrecord customerreturnvisitrecord)
    {
        return customerreturnvisitrecordMapper.insertCustomerreturnvisitrecord(customerreturnvisitrecord);
    }

    /**
     * 修改客户回访记录
     * 
     * @param customerreturnvisitrecord 客户回访记录
     * @return 结果
     */
    @Override
    public int updateCustomerreturnvisitrecord(Customerreturnvisitrecord customerreturnvisitrecord)
    {
        return customerreturnvisitrecordMapper.updateCustomerreturnvisitrecord(customerreturnvisitrecord);
    }

    /**
     * 删除客户回访记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCustomerreturnvisitrecordByIds(String ids)
    {
        return customerreturnvisitrecordMapper.deleteCustomerreturnvisitrecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户回访记录信息
     * 
     * @param id 客户回访记录ID
     * @return 结果
     */
    @Override
    public int deleteCustomerreturnvisitrecordById(Integer id)
    {
        return customerreturnvisitrecordMapper.deleteCustomerreturnvisitrecordById(id);
    }
}
