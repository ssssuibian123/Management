package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Stuff;

/**
 * 上岗人员Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface StuffMapper 
{
    /**
     * 查询上岗人员
     * 
     * @param id 上岗人员ID
     * @return 上岗人员
     */
    public Stuff selectStuffById(Integer id);

    /**
     * 查询上岗人员列表
     * 
     * @param stuff 上岗人员
     * @return 上岗人员集合
     */
    public List<Stuff> selectStuffList(Stuff stuff);

    /**
     * 新增上岗人员
     * 
     * @param stuff 上岗人员
     * @return 结果
     */
    public int insertStuff(Stuff stuff);

    /**
     * 修改上岗人员
     * 
     * @param stuff 上岗人员
     * @return 结果
     */
    public int updateStuff(Stuff stuff);

    /**
     * 删除上岗人员
     * 
     * @param id 上岗人员ID
     * @return 结果
     */
    public int deleteStuffById(Integer id);

    /**
     * 批量删除上岗人员
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStuffByIds(String[] ids);
}
