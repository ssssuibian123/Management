package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Conterman;

/**
 * 人员信息管理Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface ContermanMapper 
{
    /**
     * 查询人员信息管理
     * 
     * @param contermanId 人员信息管理ID
     * @return 人员信息管理
     */
    public Conterman selectContermanById(Long contermanId);

    /**
     * 查询人员信息管理列表
     * 
     * @param conterman 人员信息管理
     * @return 人员信息管理集合
     */
    public List<Conterman> selectContermanList(Conterman conterman);

    /**
     * 新增人员信息管理
     * 
     * @param conterman 人员信息管理
     * @return 结果
     */
    public int insertConterman(Conterman conterman);

    /**
     * 修改人员信息管理
     * 
     * @param conterman 人员信息管理
     * @return 结果
     */
    public int updateConterman(Conterman conterman);

    /**
     * 删除人员信息管理
     * 
     * @param contermanId 人员信息管理ID
     * @return 结果
     */
    public int deleteContermanById(Long contermanId);

    /**
     * 批量删除人员信息管理
     * 
     * @param contermanIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteContermanByIds(String[] contermanIds);
}
