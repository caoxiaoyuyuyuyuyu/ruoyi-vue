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
import com.ruoyi.schoolInfo.domain.MajorInfo;
import com.ruoyi.schoolInfo.service.IMajorInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 专业信息Controller
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@RestController
@RequestMapping("/schoolInfo/fun_majorInfo")
public class MajorInfoController extends BaseController
{
    @Autowired
    private IMajorInfoService majorInfoService;

    /**
     * 查询专业信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_majorInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(MajorInfo majorInfo)
    {
        startPage();
        List<MajorInfo> list = majorInfoService.selectMajorInfoList(majorInfo);
        return getDataTable(list);
    }

    /**
     * 导出专业信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_majorInfo:export')")
    @Log(title = "专业信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MajorInfo majorInfo)
    {
        List<MajorInfo> list = majorInfoService.selectMajorInfoList(majorInfo);
        ExcelUtil<MajorInfo> util = new ExcelUtil<MajorInfo>(MajorInfo.class);
        util.exportExcel(response, list, "专业信息数据");
    }

    /**
     * 获取专业信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_majorInfo:query')")
    @GetMapping(value = "/{majorId}")
    public AjaxResult getInfo(@PathVariable("majorId") Long majorId)
    {
        return success(majorInfoService.selectMajorInfoByMajorId(majorId));
    }

    /**
     * 新增专业信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_majorInfo:add')")
    @Log(title = "专业信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MajorInfo majorInfo)
    {
        return toAjax(majorInfoService.insertMajorInfo(majorInfo));
    }

    /**
     * 修改专业信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_majorInfo:edit')")
    @Log(title = "专业信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MajorInfo majorInfo)
    {
        return toAjax(majorInfoService.updateMajorInfo(majorInfo));
    }

    /**
     * 删除专业信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_majorInfo:remove')")
    @Log(title = "专业信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{majorIds}")
    public AjaxResult remove(@PathVariable Long[] majorIds)
    {
        return toAjax(majorInfoService.deleteMajorInfoByMajorIds(majorIds));
    }
}
