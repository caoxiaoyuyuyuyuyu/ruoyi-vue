package com.ruoyi.function.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.function.domain.FunAdvise;

/**
 * 投诉与建议Mapper接口
 * 
 * @author xiaoyu
 * @date 2024-08-20
 */
@DataSource(value = DataSourceType.SLAVE)
public interface FunAdviseMapper 
{
    /**
     * 查询投诉与建议
     * 
     * @param id 投诉与建议主键
     * @return 投诉与建议
     */
    public FunAdvise selectFunAdviseById(Long id);

    /**
     * 查询投诉与建议列表
     * 
     * @param funAdvise 投诉与建议
     * @return 投诉与建议集合
     */
    public List<FunAdvise> selectFunAdviseList(FunAdvise funAdvise);

    /**
     * 新增投诉与建议
     * 
     * @param funAdvise 投诉与建议
     * @return 结果
     */
    public int insertFunAdvise(FunAdvise funAdvise);

    /**
     * 修改投诉与建议
     * 
     * @param funAdvise 投诉与建议
     * @return 结果
     */
    public int updateFunAdvise(FunAdvise funAdvise);

    /**
     * 删除投诉与建议
     * 
     * @param id 投诉与建议主键
     * @return 结果
     */
    public int deleteFunAdviseById(Long id);

    /**
     * 批量删除投诉与建议
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFunAdviseByIds(Long[] ids);
}
