package com.ruoyi.schoolInfo.service;

import java.util.List;
import com.ruoyi.schoolInfo.domain.GradeInfo;

/**
 * 年级信息Service接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public interface IGradeInfoService 
{
    /**
     * 查询年级信息
     * 
     * @param gradeId 年级信息主键
     * @return 年级信息
     */
    public GradeInfo selectGradeInfoByGradeId(Long gradeId);

    /**
     * 查询年级信息列表
     * 
     * @param gradeInfo 年级信息
     * @return 年级信息集合
     */
    public List<GradeInfo> selectGradeInfoList(GradeInfo gradeInfo);

    /**
     * 新增年级信息
     * 
     * @param gradeInfo 年级信息
     * @return 结果
     */
    public int insertGradeInfo(GradeInfo gradeInfo);

    /**
     * 修改年级信息
     * 
     * @param gradeInfo 年级信息
     * @return 结果
     */
    public int updateGradeInfo(GradeInfo gradeInfo);

    /**
     * 批量删除年级信息
     * 
     * @param gradeIds 需要删除的年级信息主键集合
     * @return 结果
     */
    public int deleteGradeInfoByGradeIds(Long[] gradeIds);

    /**
     * 删除年级信息信息
     * 
     * @param gradeId 年级信息主键
     * @return 结果
     */
    public int deleteGradeInfoByGradeId(Long gradeId);
}
