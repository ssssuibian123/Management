package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ContermanBirthdayMapper;
import com.ruoyi.system.domain.ContermanBirthday;
import com.ruoyi.system.service.IContermanBirthdayService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工生日提醒Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class ContermanBirthdayServiceImpl implements IContermanBirthdayService 
{
    @Autowired
    private ContermanBirthdayMapper contermanBirthdayMapper;

    /**
     * 查询员工生日提醒
     * 
     * @param contermanId 员工生日提醒ID
     * @return 员工生日提醒
     */
    @Override
    public ContermanBirthday selectContermanBirthdayById(Long contermanId)
    {
        return contermanBirthdayMapper.selectContermanBirthdayById(contermanId);
    }

    /**
     * 查询员工生日提醒列表
     * 
     * @param contermanBirthday 员工生日提醒
     * @return 员工生日提醒
     */
    @Override
    public List<ContermanBirthday> selectContermanBirthdayList(ContermanBirthday contermanBirthday)
    {
        return contermanBirthdayMapper.selectContermanBirthdayList(contermanBirthday);
    }

    /**
     * 新增员工生日提醒
     * 
     * @param contermanBirthday 员工生日提醒
     * @return 结果
     */
    @Override
    public int insertContermanBirthday(ContermanBirthday contermanBirthday)
    {
        return contermanBirthdayMapper.insertContermanBirthday(contermanBirthday);
    }

    /**
     * 修改员工生日提醒
     * 
     * @param contermanBirthday 员工生日提醒
     * @return 结果
     */
    @Override
    public int updateContermanBirthday(ContermanBirthday contermanBirthday)
    {
        return contermanBirthdayMapper.updateContermanBirthday(contermanBirthday);
    }

    /**
     * 删除员工生日提醒对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteContermanBirthdayByIds(String ids)
    {
        return contermanBirthdayMapper.deleteContermanBirthdayByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工生日提醒信息
     * 
     * @param contermanId 员工生日提醒ID
     * @return 结果
     */
    @Override
    public int deleteContermanBirthdayById(Long contermanId)
    {
        return contermanBirthdayMapper.deleteContermanBirthdayById(contermanId);
    }
}
