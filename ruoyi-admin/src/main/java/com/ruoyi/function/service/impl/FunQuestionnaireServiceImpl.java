package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.function.domain.FunQuestion;
import com.ruoyi.function.mapper.FunQuestionnaireMapper;
import com.ruoyi.function.domain.FunQuestionnaire;
import com.ruoyi.function.service.IFunQuestionnaireService;

/**
 * 问卷Service业务层处理
 * 
 * @author xiaou
 * @date 2024-08-21
 */
@Service
public class FunQuestionnaireServiceImpl implements IFunQuestionnaireService 
{
    @Autowired
    private FunQuestionnaireMapper funQuestionnaireMapper;

    /**
     * 查询问卷
     * 
     * @param id 问卷主键
     * @return 问卷
     */
    @Override
    public FunQuestionnaire selectFunQuestionnaireById(Long id)
    {
        return funQuestionnaireMapper.selectFunQuestionnaireById(id);
    }

    /**
     * 查询问卷列表
     * 
     * @param funQuestionnaire 问卷
     * @return 问卷
     */
    @Override
    public List<FunQuestionnaire> selectFunQuestionnaireList(FunQuestionnaire funQuestionnaire)
    {
        return funQuestionnaireMapper.selectFunQuestionnaireList(funQuestionnaire);
    }

    /**
     * 新增问卷
     * 
     * @param funQuestionnaire 问卷
     * @return 结果
     */
    @Transactional
    @Override
    public int insertFunQuestionnaire(FunQuestionnaire funQuestionnaire)
    {
        int rows = funQuestionnaireMapper.insertFunQuestionnaire(funQuestionnaire);
        insertFunQuestion(funQuestionnaire);
        return rows;
    }

    /**
     * 修改问卷
     * 
     * @param funQuestionnaire 问卷
     * @return 结果
     */
    @Transactional
    @Override
    public int updateFunQuestionnaire(FunQuestionnaire funQuestionnaire)
    {
        funQuestionnaireMapper.deleteFunQuestionByQuestionnaireId(funQuestionnaire.getId());
        insertFunQuestion(funQuestionnaire);
        return funQuestionnaireMapper.updateFunQuestionnaire(funQuestionnaire);
    }

    /**
     * 批量删除问卷
     * 
     * @param ids 需要删除的问卷主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteFunQuestionnaireByIds(Long[] ids)
    {
        funQuestionnaireMapper.deleteFunQuestionByQuestionnaireIds(ids);
        return funQuestionnaireMapper.deleteFunQuestionnaireByIds(ids);
    }

    /**
     * 删除问卷信息
     * 
     * @param id 问卷主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteFunQuestionnaireById(Long id)
    {
        funQuestionnaireMapper.deleteFunQuestionByQuestionnaireId(id);
        return funQuestionnaireMapper.deleteFunQuestionnaireById(id);
    }

    /**
     * 新增问卷中的问题信息
     * 
     * @param funQuestionnaire 问卷对象
     */
    public void insertFunQuestion(FunQuestionnaire funQuestionnaire)
    {
        List<FunQuestion> funQuestionList = funQuestionnaire.getFunQuestionList();
        Long id = funQuestionnaire.getId();
        if (StringUtils.isNotNull(funQuestionList))
        {
            List<FunQuestion> list = new ArrayList<FunQuestion>();
            for (FunQuestion funQuestion : funQuestionList)
            {
                funQuestion.setQuestionnaireId(id);
                list.add(funQuestion);
            }
            if (list.size() > 0)
            {
                funQuestionnaireMapper.batchFunQuestion(list);
            }
        }
    }
}
