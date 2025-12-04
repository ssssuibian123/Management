package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ContermanMapper;
import com.ruoyi.system.domain.Conterman;
import com.ruoyi.system.service.IContermanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 人员信息管理Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class ContermanServiceImpl implements IContermanService 
{
    @Autowired
    private ContermanMapper contermanMapper;

    /**
     * 查询人员信息管理
     * 
     * @param contermanId 人员信息管理ID
     * @return 人员信息管理
     */
    @Override
    public Conterman selectContermanById(Long contermanId)
    {
        return contermanMapper.selectContermanById(contermanId);
    }

    /**
     * 查询人员信息管理列表
     * 
     * @param conterman 人员信息管理
     * @return 人员信息管理
     */
    @Override
    public List<Conterman> selectContermanList(Conterman conterman)
    {
        return contermanMapper.selectContermanList(conterman);
    }

    /**
     * 新增人员信息管理
     * 
     * @param conterman 人员信息管理
     * @return 结果
     */
    @Override
    public int insertConterman(Conterman conterman)
    {
        return contermanMapper.insertConterman(conterman);
    }

    /**
     * 修改人员信息管理
     * 
     * @param conterman 人员信息管理
     * @return 结果
     */
    @Override
    public int updateConterman(Conterman conterman)
    {
        return contermanMapper.updateConterman(conterman);
    }

    /**
     * 删除人员信息管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteContermanByIds(String ids)
    {
        return contermanMapper.deleteContermanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除人员信息管理信息
     * 
     * @param contermanId 人员信息管理ID
     * @return 结果
     */
    @Override
    public int deleteContermanById(Long contermanId)
    {
        return contermanMapper.deleteContermanById(contermanId);
    }
}
