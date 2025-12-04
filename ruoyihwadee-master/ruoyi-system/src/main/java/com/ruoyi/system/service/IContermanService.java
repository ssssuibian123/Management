package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Conterman;

/**
 * 人员信息管理Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface IContermanService 
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
     * 批量删除人员信息管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteContermanByIds(String ids);

    /**
     * 删除人员信息管理信息
     * 
     * @param contermanId 人员信息管理ID
     * @return 结果
     */
    public int deleteContermanById(Long contermanId);
}
