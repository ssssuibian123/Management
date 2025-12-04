package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StuffMapper;
import com.ruoyi.system.domain.Stuff;
import com.ruoyi.system.service.IStuffService;
import com.ruoyi.common.core.text.Convert;

/**
 * 上岗人员Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class StuffServiceImpl implements IStuffService 
{
    @Autowired
    private StuffMapper stuffMapper;

    /**
     * 查询上岗人员
     * 
     * @param id 上岗人员ID
     * @return 上岗人员
     */
    @Override
    public Stuff selectStuffById(Integer id)
    {
        return stuffMapper.selectStuffById(id);
    }

    /**
     * 查询上岗人员列表
     * 
     * @param stuff 上岗人员
     * @return 上岗人员
     */
    @Override
    public List<Stuff> selectStuffList(Stuff stuff)
    {
        return stuffMapper.selectStuffList(stuff);
    }

    /**
     * 新增上岗人员
     * 
     * @param stuff 上岗人员
     * @return 结果
     */
    @Override
    public int insertStuff(Stuff stuff)
    {
        return stuffMapper.insertStuff(stuff);
    }

    /**
     * 修改上岗人员
     * 
     * @param stuff 上岗人员
     * @return 结果
     */
    @Override
    public int updateStuff(Stuff stuff)
    {
        return stuffMapper.updateStuff(stuff);
    }

    /**
     * 删除上岗人员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStuffByIds(String ids)
    {
        return stuffMapper.deleteStuffByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除上岗人员信息
     * 
     * @param id 上岗人员ID
     * @return 结果
     */
    @Override
    public int deleteStuffById(Integer id)
    {
        return stuffMapper.deleteStuffById(id);
    }
}
