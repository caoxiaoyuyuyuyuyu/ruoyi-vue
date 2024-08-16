package com.ruoyi.function.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.function.domain.FunNotice;

/**
 * 学校通知Mapper接口
 *
 * @author xiaoyu
 * @date 2024-08-14
 */
@DataSource(value = DataSourceType.SLAVE)
public interface FunNoticeMapper
{
    /**
     * 查询学校通知
     *
     * @param id 学校通知主键
     * @return 学校通知
     */
    public FunNotice selectFunNoticeById(Long id);

    /**
     * 查询学校通知列表
     *
     * @param funNotice 学校通知
     * @return 学校通知集合
     */
    public List<FunNotice> selectFunNoticeList(FunNotice funNotice);

    /**
     * 新增学校通知
     *
     * @param funNotice 学校通知
     * @return 结果
     */
    public int insertFunNotice(FunNotice funNotice);

    /**
     * 修改学校通知
     *
     * @param funNotice 学校通知
     * @return 结果
     */
    public int updateFunNotice(FunNotice funNotice);

    /**
     * 删除学校通知
     *
     * @param id 学校通知主键
     * @return 结果
     */
    public int deleteFunNoticeById(Long id);

    /**
     * 批量删除学校通知
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFunNoticeByIds(Long[] ids);
}
