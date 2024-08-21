package com.ruoyi.function.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.function.domain.FunQuestionnaire;
import com.ruoyi.function.domain.FunQuestion;

/**
 * 问卷Mapper接口
 * 
 * @author xiaou
 * @date 2024-08-21
 */
@DataSource(value = DataSourceType.SLAVE)
public interface FunQuestionnaireMapper 
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
     * 删除问卷
     * 
     * @param id 问卷主键
     * @return 结果
     */
    public int deleteFunQuestionnaireById(Long id);

    /**
     * 批量删除问卷
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFunQuestionnaireByIds(Long[] ids);

    /**
     * 批量删除问卷中的问题
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFunQuestionByQuestionnaireIds(Long[] ids);
    
    /**
     * 批量新增问卷中的问题
     * 
     * @param funQuestionList 问卷中的问题列表
     * @return 结果
     */
    public int batchFunQuestion(List<FunQuestion> funQuestionList);
    

    /**
     * 通过问卷主键删除问卷中的问题信息
     * 
     * @param id 问卷ID
     * @return 结果
     */
    public int deleteFunQuestionByQuestionnaireId(Long id);
}
