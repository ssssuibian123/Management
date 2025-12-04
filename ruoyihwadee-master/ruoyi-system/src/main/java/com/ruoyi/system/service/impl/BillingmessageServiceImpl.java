package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BillingmessageMapper;
import com.ruoyi.system.domain.Billingmessage;
import com.ruoyi.system.service.IBillingmessageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 收款信息表Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class BillingmessageServiceImpl implements IBillingmessageService 
{
    @Autowired
    private BillingmessageMapper billingmessageMapper;

    /**
     * 查询收款信息表
     * 
     * @param id 收款信息表ID
     * @return 收款信息表
     */
    @Override
    public Billingmessage selectBillingmessageById(Integer id)
    {
        return billingmessageMapper.selectBillingmessageById(id);
    }

    /**
     * 查询收款信息表列表
     * 
     * @param billingmessage 收款信息表
     * @return 收款信息表
     */
    @Override
    public List<Billingmessage> selectBillingmessageList(Billingmessage billingmessage)
    {
        return billingmessageMapper.selectBillingmessageList(billingmessage);
    }

    /**
     * 新增收款信息表
     * 
     * @param billingmessage 收款信息表
     * @return 结果
     */
    @Override
    public int insertBillingmessage(Billingmessage billingmessage)
    {
        return billingmessageMapper.insertBillingmessage(billingmessage);
    }

    /**
     * 修改收款信息表
     * 
     * @param billingmessage 收款信息表
     * @return 结果
     */
    @Override
    public int updateBillingmessage(Billingmessage billingmessage)
    {
        return billingmessageMapper.updateBillingmessage(billingmessage);
    }

    /**
     * 删除收款信息表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBillingmessageByIds(String ids)
    {
        return billingmessageMapper.deleteBillingmessageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除收款信息表信息
     * 
     * @param id 收款信息表ID
     * @return 结果
     */
    @Override
    public int deleteBillingmessageById(Integer id)
    {
        return billingmessageMapper.deleteBillingmessageById(id);
    }
}
