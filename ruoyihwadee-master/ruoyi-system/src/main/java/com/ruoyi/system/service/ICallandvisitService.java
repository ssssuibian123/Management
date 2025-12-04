package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Callandvisit;

/**
 * 来电来访情况Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface ICallandvisitService 
{
    /**
     * 查询来电来访情况
     * 
     * @param id 来电来访情况ID
     * @return 来电来访情况
     */
    public Callandvisit selectCallandvisitById(Integer id);

    /**
     * 查询来电来访情况列表
     * 
     * @param callandvisit 来电来访情况
     * @return 来电来访情况集合
     */
    public List<Callandvisit> selectCallandvisitList(Callandvisit callandvisit);

    /**
     * 新增来电来访情况
     * 
     * @param callandvisit 来电来访情况
     * @return 结果
     */
    public int insertCallandvisit(Callandvisit callandvisit);

    /**
     * 修改来电来访情况
     * 
     * @param callandvisit 来电来访情况
     * @return 结果
     */
    public int updateCallandvisit(Callandvisit callandvisit);

    /**
     * 批量删除来电来访情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCallandvisitByIds(String ids);

    /**
     * 删除来电来访情况信息
     * 
     * @param id 来电来访情况ID
     * @return 结果
     */
    public int deleteCallandvisitById(Integer id);
}
