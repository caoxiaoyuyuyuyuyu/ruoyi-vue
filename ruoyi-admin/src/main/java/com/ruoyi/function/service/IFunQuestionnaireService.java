package com.ruoyi.function.service;

import java.util.List;
import com.ruoyi.function.domain.FunQuestionnaire;

/**
 * 问卷Service接口
 * 
 * @author xiaou
 * @date 2024-08-21
 */
public interface IFunQuestionnaireService 
{
    /**
     * 查询问卷
     * 
     * @param id 问卷主键
     * @return 问卷
     */
    public FunQuestionnaire selectFunQuestionnaireById(Long id);

    /**
     * 查询问卷列表
     * 
     * @param funQuestionnaire 问卷
     * @return 问卷集合
     */
    public List<FunQuestionnaire> selectFunQuestionnaireList(FunQuestionnaire funQuestionnaire);

    /**
     * 新增问卷
     * 
     * @param funQuestionnaire 问卷
     * @return 结果
     */
    public int insertFunQuestionnaire(FunQuestionnaire funQuestionnaire);

    /**
     * 修改问卷
     * 
     * @param funQuestionnaire 问卷
     * @return 结果
     */
    public int updateFunQuestionnaire(FunQuestionnaire funQuestionnaire);

    /**
     * 批量删除问卷
     * 
     * @param ids 需要删除的问卷主键集合
     * @return 结果
     */
    public int deleteFunQuestionnaireByIds(Long[] ids);

    /**
     * 删除问卷信息
     * 
     * @param id 问卷主键
     * @return 结果
     */
    public int deleteFunQuestionnaireById(Long id);
}
