package com.ruoyi.function.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.function.domain.LeaveMentor;

/**
 * leave_mentorMapper接口
 * 
 * @author xiaou
 * @date 2024-09-15
 */
@DataSource(value = DataSourceType.SLAVE)
public interface LeaveMentorMapper 
{
    /**
     * 查询leave_mentor
     * 
     * @param id leave_mentor主键
     * @return leave_mentor
     */
    public LeaveMentor selectLeaveMentorById(Long id);

    /**
     * 查询leave_mentor列表
     * 
     * @param leaveMentor leave_mentor
     * @return leave_mentor集合
     */
    public List<LeaveMentor> selectLeaveMentorList(LeaveMentor leaveMentor);

    /**
     * 新增leave_mentor
     * 
     * @param leaveMentor leave_mentor
     * @return 结果
     */
    public int insertLeaveMentor(LeaveMentor leaveMentor);

    /**
     * 修改leave_mentor
     * 
     * @param leaveMentor leave_mentor
     * @return 结果
     */
    public int updateLeaveMentor(LeaveMentor leaveMentor);

    /**
     * 删除leave_mentor
     * 
     * @param id leave_mentor主键
     * @return 结果
     */
    public int deleteLeaveMentorById(Long id);

    /**
     * 批量删除leave_mentor
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLeaveMentorByIds(Long[] ids);
}
