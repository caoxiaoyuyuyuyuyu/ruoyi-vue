package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.LeaveMentorMapper;
import com.ruoyi.function.domain.LeaveMentor;
import com.ruoyi.function.service.ILeaveMentorService;

/**
 * leave_mentorService业务层处理
 *
 * @author xiaou
 * @date 2024-09-15
 */
@Service
public class LeaveMentorServiceImpl implements ILeaveMentorService
{
    @Autowired
    private LeaveMentorMapper leaveMentorMapper;

    /**
     * 查询leave_mentor
     *
     * @param id leave_mentor主键
     * @return leave_mentor
     */
    @Override
    public LeaveMentor selectLeaveMentorById(Long id)
    {
        return leaveMentorMapper.selectLeaveMentorById(id);
    }

    /**
     * 查询leave_mentor列表
     *
     * @param leaveMentor leave_mentor
     * @return leave_mentor
     */
    @Override
    public List<LeaveMentor> selectLeaveMentorList(LeaveMentor leaveMentor)
    {
        return leaveMentorMapper.selectLeaveMentorList(leaveMentor);
    }

    /**
     * 新增leave_mentor
     *
     * @param leaveMentor leave_mentor
     * @return 结果
     */
    @Override
    public int insertLeaveMentor(LeaveMentor leaveMentor)
    {
        return leaveMentorMapper.insertLeaveMentor(leaveMentor);
    }

    /**
     * 修改leave_mentor
     *
     * @param leaveMentor leave_mentor
     * @return 结果
     */
    @Override
    public int updateLeaveMentor(LeaveMentor leaveMentor)
    {
        return leaveMentorMapper.updateLeaveMentor(leaveMentor);
    }

    /**
     * 批量删除leave_mentor
     *
     * @param ids 需要删除的leave_mentor主键
     * @return 结果
     */
    @Override
    public int deleteLeaveMentorByIds(Long[] ids)
    {
        return leaveMentorMapper.deleteLeaveMentorByIds(ids);
    }

    /**
     * 删除leave_mentor信息
     *
     * @param id leave_mentor主键
     * @return 结果
     */
    @Override
    public int deleteLeaveMentorById(Long id)
    {
        return leaveMentorMapper.deleteLeaveMentorById(id);
    }
}
