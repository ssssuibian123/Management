package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ReceptionSituation;

/**
 * 接待情况Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface ReceptionSituationMapper 
{
    /**
     * 查询接待情况
     * 
     * @param id 接待情况ID
     * @return 接待情况
     */
    public ReceptionSituation selectReceptionSituationById(Integer id);

    /**
     * 查询接待情况列表
     * 
     * @param receptionSituation 接待情况
     * @return 接待情况集合
     */
    public List<ReceptionSituation> selectReceptionSituationList(ReceptionSituation receptionSituation);

    /**
     * 新增接待情况
     * 
     * @param receptionSituation 接待情况
     * @return 结果
     */
    public int insertReceptionSituation(ReceptionSituation receptionSituation);

    /**
     * 修改接待情况
     * 
     * @param receptionSituation 接待情况
     * @return 结果
     */
    public int updateReceptionSituation(ReceptionSituation receptionSituation);

    /**
     * 删除接待情况
     * 
     * @param id 接待情况ID
     * @return 结果
     */
    public int deleteReceptionSituationById(Integer id);

    /**
     * 批量删除接待情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteReceptionSituationByIds(String[] ids);
}
