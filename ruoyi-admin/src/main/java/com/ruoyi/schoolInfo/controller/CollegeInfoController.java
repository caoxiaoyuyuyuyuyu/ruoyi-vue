package com.ruoyi.schoolInfo.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.schoolInfo.domain.CollegeInfo;
import com.ruoyi.schoolInfo.service.ICollegeInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学院信息Controller
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@RestController
@RequestMapping("/schoolInfo/fun_collegeInfo")
public class CollegeInfoController extends BaseController
{
    @Autowired
    private ICollegeInfoService collegeInfoService;

    /**
     * 查询学院信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_collegeInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(CollegeInfo collegeInfo)
    {
        startPage();
        List<CollegeInfo> list = collegeInfoService.selectCollegeInfoList(collegeInfo);
        return getDataTable(list);
    }

    /**
     * 导出学院信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_collegeInfo:export')")
    @Log(title = "学院信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CollegeInfo collegeInfo)
    {
        List<CollegeInfo> list = collegeInfoService.selectCollegeInfoList(collegeInfo);
        ExcelUtil<CollegeInfo> util = new ExcelUtil<CollegeInfo>(CollegeInfo.class);
        util.exportExcel(response, list, "学院信息数据");
    }

    /**
     * 获取学院信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_collegeInfo:query')")
    @GetMapping(value = "/{collegeId}")
    public AjaxResult getInfo(@PathVariable("collegeId") Long collegeId)
    {
        return success(collegeInfoService.selectCollegeInfoByCollegeId(collegeId));
    }

    /**
     * 新增学院信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_collegeInfo:add')")
    @Log(title = "学院信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CollegeInfo collegeInfo)
    {
        return toAjax(collegeInfoService.insertCollegeInfo(collegeInfo));
    }

    /**
     * 修改学院信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_collegeInfo:edit')")
    @Log(title = "学院信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CollegeInfo collegeInfo)
    {
        return toAjax(collegeInfoService.updateCollegeInfo(collegeInfo));
    }

    /**
     * 删除学院信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_collegeInfo:remove')")
    @Log(title = "学院信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{collegeIds}")
    public AjaxResult remove(@PathVariable Long[] collegeIds)
    {
        return toAjax(collegeInfoService.deleteCollegeInfoByCollegeIds(collegeIds));
    }
}
