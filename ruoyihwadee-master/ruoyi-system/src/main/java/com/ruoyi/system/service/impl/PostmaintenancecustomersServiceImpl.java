package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PostmaintenancecustomersMapper;
import com.ruoyi.system.domain.Postmaintenancecustomers;
import com.ruoyi.system.service.IPostmaintenancecustomersService;
import com.ruoyi.common.core.text.Convert;

/**
 * 后期维护客户表Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class PostmaintenancecustomersServiceImpl implements IPostmaintenancecustomersService 
{
    @Autowired
    private PostmaintenancecustomersMapper postmaintenancecustomersMapper;

    /**
     * 查询后期维护客户表
     * 
     * @param id 后期维护客户表ID
     * @return 后期维护客户表
     */
    @Override
    public Postmaintenancecustomers selectPostmaintenancecustomersById(Integer id)
    {
        return postmaintenancecustomersMapper.selectPostmaintenancecustomersById(id);
    }

    /**
     * 查询后期维护客户表列表
     * 
     * @param postmaintenancecustomers 后期维护客户表
     * @return 后期维护客户表
     */
    @Override
    public List<Postmaintenancecustomers> selectPostmaintenancecustomersList(Postmaintenancecustomers postmaintenancecustomers)
    {
        return postmaintenancecustomersMapper.selectPostmaintenancecustomersList(postmaintenancecustomers);
    }

    /**
     * 新增后期维护客户表
     * 
     * @param postmaintenancecustomers 后期维护客户表
     * @return 结果
     */
    @Override
    public int insertPostmaintenancecustomers(Postmaintenancecustomers postmaintenancecustomers)
    {
        return postmaintenancecustomersMapper.insertPostmaintenancecustomers(postmaintenancecustomers);
    }

    /**
     * 修改后期维护客户表
     * 
     * @param postmaintenancecustomers 后期维护客户表
     * @return 结果
     */
    @Override
    public int updatePostmaintenancecustomers(Postmaintenancecustomers postmaintenancecustomers)
    {
        return postmaintenancecustomersMapper.updatePostmaintenancecustomers(postmaintenancecustomers);
    }

    /**
     * 删除后期维护客户表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePostmaintenancecustomersByIds(String ids)
    {
        return postmaintenancecustomersMapper.deletePostmaintenancecustomersByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除后期维护客户表信息
     * 
     * @param id 后期维护客户表ID
     * @return 结果
     */
    @Override
    public int deletePostmaintenancecustomersById(Integer id)
    {
        return postmaintenancecustomersMapper.deletePostmaintenancecustomersById(id);
    }
}
