package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.FunQuestionMapper;
import com.ruoyi.function.domain.FunQuestion;
import com.ruoyi.function.service.IFunQuestionService;

/**
 * 问卷中的问题Service业务层处理
 * 
 * @author xiaou
 * @date 2024-08-21
 */
@Service
public class FunQuestionServiceImpl implements IFunQuestionService 
{
    @Autowired
    private FunQuestionMapper funQuestionMapper;

    /**
     * 查询问卷中的问题
     * 
     * @param id 问卷中的问题主键
     * @return 问卷中的问题
     */
    @Override
    public FunQuestion selectFunQuestionById(Long id)
    {
        return funQuestionMapper.selectFunQuestionById(id);
    }

    /**
     * 查询问卷中的问题列表
     * 
     * @param funQuestion 问卷中的问题
     * @return 问卷中的问题
     */
    @Override
    public List<FunQuestion> selectFunQuestionList(FunQuestion funQuestion)
    {
        return funQuestionMapper.selectFunQuestionList(funQuestion);
    }

    /**
     * 新增问卷中的问题
     * 
     * @param funQuestion 问卷中的问题
     * @return 结果
     */
    @Override
    public int insertFunQuestion(FunQuestion funQuestion)
    {
        return funQuestionMapper.insertFunQuestion(funQuestion);
    }

    /**
     * 修改问卷中的问题
     * 
     * @param funQuestion 问卷中的问题
     * @return 结果
     */
    @Override
    public int updateFunQuestion(FunQuestion funQuestion)
    {
        return funQuestionMapper.updateFunQuestion(funQuestion);
    }

    /**
     * 批量删除问卷中的问题
     * 
     * @param ids 需要删除的问卷中的问题主键
     * @return 结果
     */
    @Override
    public int deleteFunQuestionByIds(Long[] ids)
    {
        return funQuestionMapper.deleteFunQuestionByIds(ids);
    }

    /**
     * 删除问卷中的问题信息
     * 
     * @param id 问卷中的问题主键
     * @return 结果
     */
    @Override
    public int deleteFunQuestionById(Long id)
    {
        return funQuestionMapper.deleteFunQuestionById(id);
    }
}
