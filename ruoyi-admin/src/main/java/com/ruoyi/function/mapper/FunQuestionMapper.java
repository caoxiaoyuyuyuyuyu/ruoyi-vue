package com.ruoyi.function.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.function.domain.FunQuestion;

/**
 * 问卷中的问题Mapper接口
 * 
 * @author xiaou
 * @date 2024-08-21
 */
@DataSource(value = DataSourceType.SLAVE)
public interface FunQuestionMapper 
{
    /**
     * 查询问卷中的问题
     * 
     * @param id 问卷中的问题主键
     * @return 问卷中的问题
     */
    public FunQuestion selectFunQuestionById(Long id);

    /**
     * 查询问卷中的问题列表
     * 
     * @param funQuestion 问卷中的问题
     * @return 问卷中的问题集合
     */
    public List<FunQuestion> selectFunQuestionList(FunQuestion funQuestion);

    /**
     * 新增问卷中的问题
     * 
     * @param funQuestion 问卷中的问题
     * @return 结果
     */
    public int insertFunQuestion(FunQuestion funQuestion);

    /**
     * 修改问卷中的问题
     * 
     * @param funQuestion 问卷中的问题
     * @return 结果
     */
    public int updateFunQuestion(FunQuestion funQuestion);

    /**
     * 删除问卷中的问题
     * 
     * @param id 问卷中的问题主键
     * @return 结果
     */
    public int deleteFunQuestionById(Long id);

    /**
     * 批量删除问卷中的问题
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFunQuestionByIds(Long[] ids);
}
