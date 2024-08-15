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
import com.ruoyi.schoolInfo.domain.CampusInfo;
import com.ruoyi.schoolInfo.service.ICampusInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学校信息Controller
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@RestController
@RequestMapping("/schoolInfo/fun_campusInfo")
public class CampusInfoController extends BaseController
{
    @Autowired
    private ICampusInfoService campusInfoService;

    /**
     * 查询学校信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_campusInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(CampusInfo campusInfo)
    {
        startPage();
        List<CampusInfo> list = campusInfoService.selectCampusInfoList(campusInfo);
        return getDataTable(list);
    }

    /**
     * 导出学校信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_campusInfo:export')")
    @Log(title = "学校信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CampusInfo campusInfo)
    {
        List<CampusInfo> list = campusInfoService.selectCampusInfoList(campusInfo);
        ExcelUtil<CampusInfo> util = new ExcelUtil<CampusInfo>(CampusInfo.class);
        util.exportExcel(response, list, "学校信息数据");
    }

    /**
     * 获取学校信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_campusInfo:query')")
    @GetMapping(value = "/{campusId}")
    public AjaxResult getInfo(@PathVariable("campusId") Long campusId)
    {
        return success(campusInfoService.selectCampusInfoByCampusId(campusId));
    }

    /**
     * 新增学校信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_campusInfo:add')")
    @Log(title = "学校信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CampusInfo campusInfo)
    {
        return toAjax(campusInfoService.insertCampusInfo(campusInfo));
    }

    /**
     * 修改学校信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_campusInfo:edit')")
    @Log(title = "学校信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CampusInfo campusInfo)
    {
        return toAjax(campusInfoService.updateCampusInfo(campusInfo));
    }

    /**
     * 删除学校信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_campusInfo:remove')")
    @Log(title = "学校信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{campusIds}")
    public AjaxResult remove(@PathVariable Long[] campusIds)
    {
        return toAjax(campusInfoService.deleteCampusInfoByCampusIds(campusIds));
    }
}
