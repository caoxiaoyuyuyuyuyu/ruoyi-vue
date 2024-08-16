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
import com.ruoyi.schoolInfo.domain.BuildingInfo;
import com.ruoyi.schoolInfo.service.IBuildingInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍信息Controller
 *
 * @author xiaoyu
 * @date 2024-08-16
 */
@RestController
@RequestMapping("/schoolInfo/buildingInfo")
public class BuildingInfoController extends BaseController
{
    @Autowired
    private IBuildingInfoService buildingInfoService;

    /**
     * 查询宿舍信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:buildingInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(BuildingInfo buildingInfo)
    {
        startPage();
        List<BuildingInfo> list = buildingInfoService.selectBuildingInfoList(buildingInfo);
        return getDataTable(list);
    }

    /**
     * 导出宿舍信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:buildingInfo:export')")
    @Log(title = "宿舍信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BuildingInfo buildingInfo)
    {
        List<BuildingInfo> list = buildingInfoService.selectBuildingInfoList(buildingInfo);
        ExcelUtil<BuildingInfo> util = new ExcelUtil<BuildingInfo>(BuildingInfo.class);
        util.exportExcel(response, list, "宿舍信息数据");
    }

    /**
     * 获取宿舍信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:buildingInfo:query')")
    @GetMapping(value = "/{buildingId}")
    public AjaxResult getInfo(@PathVariable("buildingId") Long buildingId)
    {
        return success(buildingInfoService.selectBuildingInfoByBuildingId(buildingId));
    }

    /**
     * 新增宿舍信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:buildingInfo:add')")
    @Log(title = "宿舍信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BuildingInfo buildingInfo)
    {
        return toAjax(buildingInfoService.insertBuildingInfo(buildingInfo));
    }

    /**
     * 修改宿舍信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:buildingInfo:edit')")
    @Log(title = "宿舍信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BuildingInfo buildingInfo)
    {
        return toAjax(buildingInfoService.updateBuildingInfo(buildingInfo));
    }

    /**
     * 删除宿舍信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:buildingInfo:remove')")
    @Log(title = "宿舍信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{buildingIds}")
    public AjaxResult remove(@PathVariable Long[] buildingIds)
    {
        return toAjax(buildingInfoService.deleteBuildingInfoByBuildingIds(buildingIds));
    }
}
