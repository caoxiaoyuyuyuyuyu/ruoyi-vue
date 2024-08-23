package com.ruoyi.function.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.QuesAnswerStatisticsMapper;
import com.ruoyi.function.domain.QuesAnswerStatistics;
import com.ruoyi.function.service.IQuesAnswerStatisticsService;

/**
 * 问卷作答统计Service业务层处理
 * 
 * @author xiaou
 * @date 2024-08-22
 */
@Service
@DataSource(DataSourceType.SLAVE)
public class QuesAnswerStatisticsServiceImpl implements IQuesAnswerStatisticsService 
{
    @Autowired
    private QuesAnswerStatisticsMapper quesAnswerStatisticsMapper;

    /**
     * 查询问卷作答统计
     * 
     * @param id 问卷作答统计主键
     * @return 问卷作答统计
     */
    @Override
    public QuesAnswerStatistics selectQuesAnswerStatisticsById(Long id)
    {
        return quesAnswerStatisticsMapper.selectQuesAnswerStatisticsById(id);
    }

    /**
     * 查询问卷作答统计列表
     * 
     * @param quesAnswerStatistics 问卷作答统计
     * @return 问卷作答统计
     */
    @Override
    public List<QuesAnswerStatistics> selectQuesAnswerStatisticsList(QuesAnswerStatistics quesAnswerStatistics)
    {
        return quesAnswerStatisticsMapper.selectQuesAnswerStatisticsList(quesAnswerStatistics);
    }

    /**
     * 新增问卷作答统计
     * 
     * @param quesAnswerStatistics 问卷作答统计
     * @return 结果
     */
    @Override
    public int insertQuesAnswerStatistics(QuesAnswerStatistics quesAnswerStatistics)
    {
        return quesAnswerStatisticsMapper.insertQuesAnswerStatistics(quesAnswerStatistics);
    }

    /**
     * 修改问卷作答统计
     * 
     * @param quesAnswerStatistics 问卷作答统计
     * @return 结果
     */
    @Override
    public int updateQuesAnswerStatistics(QuesAnswerStatistics quesAnswerStatistics)
    {
        return quesAnswerStatisticsMapper.updateQuesAnswerStatistics(quesAnswerStatistics);
    }

    /**
     * 批量删除问卷作答统计
     * 
     * @param ids 需要删除的问卷作答统计主键
     * @return 结果
     */
    @Override
    public int deleteQuesAnswerStatisticsByIds(Long[] ids)
    {
        return quesAnswerStatisticsMapper.deleteQuesAnswerStatisticsByIds(ids);
    }

    /**
     * 删除问卷作答统计信息
     * 
     * @param id 问卷作答统计主键
     * @return 结果
     */
    @Override
    public int deleteQuesAnswerStatisticsById(Long id)
    {
        return quesAnswerStatisticsMapper.deleteQuesAnswerStatisticsById(id);
    }
}
