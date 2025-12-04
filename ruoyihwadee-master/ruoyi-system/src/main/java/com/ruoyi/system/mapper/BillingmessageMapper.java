package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Billingmessage;

/**
 * 收款信息表Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface BillingmessageMapper 
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
     * 删除收款信息表
     * 
     * @param id 收款信息表ID
     * @return 结果
     */
    public int deleteBillingmessageById(Integer id);

    /**
     * 批量删除收款信息表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBillingmessageByIds(String[] ids);
}
