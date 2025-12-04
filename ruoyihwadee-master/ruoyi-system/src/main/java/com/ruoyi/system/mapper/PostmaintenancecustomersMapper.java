package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Postmaintenancecustomers;

/**
 * 后期维护客户表Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface PostmaintenancecustomersMapper 
{
    /**
     * 查询后期维护客户表
     * 
     * @param id 后期维护客户表ID
     * @return 后期维护客户表
     */
    public Postmaintenancecustomers selectPostmaintenancecustomersById(Integer id);

    /**
     * 查询后期维护客户表列表
     * 
     * @param postmaintenancecustomers 后期维护客户表
     * @return 后期维护客户表集合
     */
    public List<Postmaintenancecustomers> selectPostmaintenancecustomersList(Postmaintenancecustomers postmaintenancecustomers);

    /**
     * 新增后期维护客户表
     * 
     * @param postmaintenancecustomers 后期维护客户表
     * @return 结果
     */
    public int insertPostmaintenancecustomers(Postmaintenancecustomers postmaintenancecustomers);

    /**
     * 修改后期维护客户表
     * 
     * @param postmaintenancecustomers 后期维护客户表
     * @return 结果
     */
    public int updatePostmaintenancecustomers(Postmaintenancecustomers postmaintenancecustomers);

    /**
     * 删除后期维护客户表
     * 
     * @param id 后期维护客户表ID
     * @return 结果
     */
    public int deletePostmaintenancecustomersById(Integer id);

    /**
     * 批量删除后期维护客户表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePostmaintenancecustomersByIds(String[] ids);
}
