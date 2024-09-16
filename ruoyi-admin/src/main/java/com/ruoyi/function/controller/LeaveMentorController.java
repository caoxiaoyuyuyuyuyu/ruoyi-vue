package com.ruoyi.function.controller;

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
import com.ruoyi.function.domain.LeaveMentor;
import com.ruoyi.function.service.ILeaveMentorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * leave_mentorController
 *
 * @author xiaou
 * @date 2024-09-15
 */
@RestController
@RequestMapping("/function/leave_mentor")
public class LeaveMentorController extends BaseController
{
    @Autowired
    private ILeaveMentorService leaveMentorService;

    /**
     * 查询leave_mentor列表
     */
    @PreAuthorize("@ss.hasPermi('function:leave_mentor:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeaveMentor leaveMentor)
    {
        startPage();
        List<LeaveMentor> list = leaveMentorService.selectLeaveMentorList(leaveMentor);
        return getDataTable(list);
    }

    /**
     * 导出leave_mentor列表
     */
    @PreAuthorize("@ss.hasPermi('function:leave_mentor:export')")
    @Log(title = "leave_mentor", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeaveMentor leaveMentor)
    {
        List<LeaveMentor> list = leaveMentorService.selectLeaveMentorList(leaveMentor);
        ExcelUtil<LeaveMentor> util = new ExcelUtil<LeaveMentor>(LeaveMentor.class);
        util.exportExcel(response, list, "leave_mentor数据");
    }

    /**
     * 获取leave_mentor详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:leave_mentor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(leaveMentorService.selectLeaveMentorById(id));
    }

    /**
     * 新增leave_mentor
     */
    @PreAuthorize("@ss.hasPermi('function:leave_mentor:add')")
    @Log(title = "leave_mentor", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeaveMentor leaveMentor)
    {
        return toAjax(leaveMentorService.insertLeaveMentor(leaveMentor));
    }

    /**
     * 修改leave_mentor
     */
    @PreAuthorize("@ss.hasPermi('function:leave_mentor:edit')")
    @Log(title = "leave_mentor", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeaveMentor leaveMentor)
    {
        return toAjax(leaveMentorService.updateLeaveMentor(leaveMentor));
    }

    /**
     * 删除leave_mentor
     */
    @PreAuthorize("@ss.hasPermi('function:leave_mentor:remove')")
    @Log(title = "leave_mentor", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(leaveMentorService.deleteLeaveMentorByIds(ids));
    }
}
