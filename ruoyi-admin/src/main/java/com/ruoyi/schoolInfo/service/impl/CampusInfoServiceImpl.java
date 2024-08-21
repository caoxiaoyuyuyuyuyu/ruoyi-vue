package com.ruoyi.schoolInfo.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.schoolInfo.service.IGradeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.schoolInfo.domain.GradeInfo;
import com.ruoyi.schoolInfo.mapper.CampusInfoMapper;
import com.ruoyi.schoolInfo.domain.CampusInfo;
import com.ruoyi.schoolInfo.service.ICampusInfoService;

import static org.apache.commons.lang3.ArrayUtils.toArray;

/**
 * 学校信息Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class CampusInfoServiceImpl implements ICampusInfoService 
{
    @Autowired
    private CampusInfoMapper campusInfoMapper;

    @Autowired
    private IGradeInfoService gradeInfoService;
    /**
     * 查询学校信息
     * 
     * @param campusId 学校信息主键
     * @return 学校信息
     */
    @Override
    public CampusInfo selectCampusInfoByCampusId(Long campusId)
    {
        return campusInfoMapper.selectCampusInfoByCampusId(campusId);
    }

    /**
     * 查询学校信息列表
     * 
     * @param campusInfo 学校信息
     * @return 学校信息
     */
    @Override
    public List<CampusInfo> selectCampusInfoList(CampusInfo campusInfo)
    {
        return campusInfoMapper.selectCampusInfoList(campusInfo);
    }

    /**
     * 新增学校信息
     * 
     * @param campusInfo 学校信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCampusInfo(CampusInfo campusInfo)
    {
        int rows = campusInfoMapper.insertCampusInfo(campusInfo);
        insertGradeInfo(campusInfo);
        return rows;
    }

    /**
     * 修改学校信息
     * 
     * @param campusInfo 学校信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCampusInfo(CampusInfo campusInfo)
    {
//        campusInfoMapper.deleteGradeInfoByCampusId(campusInfo.getCampusId());
//        insertGradeInfo(campusInfo);
        return campusInfoMapper.updateCampusInfo(campusInfo);
    }

    /**
     * 批量删除学校信息
     * 
     * @param campusIds 需要删除的学校信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCampusInfoByCampusIds(Long[] campusIds)
    {
        List<Long> gradeInfoList = campusInfoMapper.selectGradeInfoByCampusIds(campusIds);
        System.out.println("**gradeIdList"+gradeInfoList.toString());
        gradeInfoService.deleteGradeInfoByGradeIds(gradeInfoList.toArray(new Long[0]));
        return campusInfoMapper.deleteCampusInfoByCampusIds(campusIds);
    }

    /**
     * 删除学校信息信息
     * 
     * @param campusId 学校信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCampusInfoByCampusId(Long campusId)
    {
        campusInfoMapper.deleteGradeInfoByCampusId(campusId);
        return campusInfoMapper.deleteCampusInfoByCampusId(campusId);
    }

    /**
     * 新增年级信息信息
     * 
     * @param campusInfo 学校信息对象
     */
    public void insertGradeInfo(CampusInfo campusInfo)
    {
        List<GradeInfo> gradeInfoList = campusInfo.getGradeInfoList();
        Long campusId = campusInfo.getCampusId();
        if (StringUtils.isNotNull(gradeInfoList))
        {
            List<GradeInfo> list = new ArrayList<GradeInfo>();
            for (GradeInfo gradeInfo : gradeInfoList)
            {
                gradeInfo.setCampusId(campusId);
                list.add(gradeInfo);
            }
            if (list.size() > 0)
            {
                campusInfoMapper.batchGradeInfo(list);
            }
        }
    }
}
