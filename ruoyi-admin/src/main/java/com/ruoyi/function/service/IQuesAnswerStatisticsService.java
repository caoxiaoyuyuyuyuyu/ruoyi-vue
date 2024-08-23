package com.ruoyi.function.service;

import java.util.List;
import com.ruoyi.function.domain.QuesAnswerStatistics;

/**
 * 问卷作答统计Service接口
 * 
 * @author xiaou
 * @date 2024-08-22
 */
public interface IQuesAnswerStatisticsService 
{
    /**
     * 查询问卷作答统计
     * 
     * @param id 问卷作答统计主键
     * @return 问卷作答统计
     */
    public QuesAnswerStatistics selectQuesAnswerStatisticsById(Long id);

    /**
     * 查询问卷作答统计列表
     * 
     * @param quesAnswerStatistics 问卷作答统计
     * @return 问卷作答统计集合
     */
    public List<QuesAnswerStatistics> selectQuesAnswerStatisticsList(QuesAnswerStatistics quesAnswerStatistics);

    /**
     * 新增问卷作答统计
     * 
     * @param quesAnswerStatistics 问卷作答统计
     * @return 结果
     */
    public int insertQuesAnswerStatistics(QuesAnswerStatistics quesAnswerStatistics);

    /**
     * 修改问卷作答统计
     * 
     * @param quesAnswerStatistics 问卷作答统计
     * @return 结果
     */
    public int updateQuesAnswerStatistics(QuesAnswerStatistics quesAnswerStatistics);

    /**
     * 批量删除问卷作答统计
     * 
     * @param ids 需要删除的问卷作答统计主键集合
     * @return 结果
     */
    public int deleteQuesAnswerStatisticsByIds(Long[] ids);

    /**
     * 删除问卷作答统计信息
     * 
     * @param id 问卷作答统计主键
     * @return 结果
     */
    public int deleteQuesAnswerStatisticsById(Long id);
}
