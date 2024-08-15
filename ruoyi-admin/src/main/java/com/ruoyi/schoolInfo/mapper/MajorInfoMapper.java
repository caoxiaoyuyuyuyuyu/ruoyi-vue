package com.ruoyi.schoolInfo.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.schoolInfo.domain.MajorInfo;
import com.ruoyi.schoolInfo.domain.ClassInfo;

/**
 * 专业信息Mapper接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@DataSource(value = DataSourceType.SLAVE)
public interface MajorInfoMapper 
{
    /**
     * 查询专业信息
     * 
     * @param majorId 专业信息主键
     * @return 专业信息
     */
    public MajorInfo selectMajorInfoByMajorId(Long majorId);

    /**
     * 查询专业信息列表
     * 
     * @param majorInfo 专业信息
     * @return 专业信息集合
     */
    public List<MajorInfo> selectMajorInfoList(MajorInfo majorInfo);

    /**
     * 新增专业信息
     * 
     * @param majorInfo 专业信息
     * @return 结果
     */
    public int insertMajorInfo(MajorInfo majorInfo);

    /**
     * 修改专业信息
     * 
     * @param majorInfo 专业信息
     * @return 结果
     */
    public int updateMajorInfo(MajorInfo majorInfo);

    /**
     * 删除专业信息
     * 
     * @param majorId 专业信息主键
     * @return 结果
     */
    public int deleteMajorInfoByMajorId(Long majorId);

    /**
     * 批量删除专业信息
     * 
     * @param majorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMajorInfoByMajorIds(Long[] majorIds);

    /**
     * 批量删除班级信息
     * 
     * @param majorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteClassInfoByMajorIds(Long[] majorIds);
    
    /**
     * 批量新增班级信息
     * 
     * @param classInfoList 班级信息列表
     * @return 结果
     */
    public int batchClassInfo(List<ClassInfo> classInfoList);
    

    /**
     * 通过专业信息主键删除班级信息信息
     * 
     * @param majorId 专业信息ID
     * @return 结果
     */
    public int deleteClassInfoByMajorId(Long majorId);
}
