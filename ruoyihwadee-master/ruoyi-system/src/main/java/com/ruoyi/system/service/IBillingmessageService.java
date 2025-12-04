package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Billingmessage;

/**
 * 收款信息表Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface IBillingmessageService 
{
    /**
     * 查询收款信息表
     * 
     * @param id 收款信息表ID
     * @return 收款信息表
     */
    public Billingmessage selectBillingmessageById(Integer id);

    /**
     * 查询收款信息表列表
     * 
     * @param billingmessage 收款信息表
     * @return 收款信息表集合
     */
    public List<Billingmessage> selectBillingmessageList(Billingmessage billingmessage);

    /**
     * 新增收款信息表
     * 
     * @param billingmessage 收款信息表
     * @return 结果
     */
    public int insertBillingmessage(Billingmessage billingmessage);

    /**
     * 修改收款信息表
     * 
     * @param billingmessage 收款信息表
     * @return 结果
     */
    public int updateBillingmessage(Billingmessage billingmessage);

    /**
     * 批量删除收款信息表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBillingmessageByIds(String ids);

    /**
     * 删除收款信息表信息
     * 
     * @param id 收款信息表ID
     * @return 结果
     */
    public int deleteBillingmessageById(Integer id);
}
