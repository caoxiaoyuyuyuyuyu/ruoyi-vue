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
import com.ruoyi.function.domain.LeavePost;
import com.ruoyi.function.service.ILeavePostService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * leave_postController
 *
 * @author xiaou
 * @date 2024-09-15
 */
@RestController
@RequestMapping("/function/leave_post")
public class LeavePostController extends BaseController
{
    @Autowired
    private ILeavePostService leavePostService;

    /**
     * 查询leave_post列表
     */
    @PreAuthorize("@ss.hasPermi('function:leave_post:list')")
    @GetMapping("/list")
    public TableDataInfo list(LeavePost leavePost)
    {
        startPage();
        List<LeavePost> list = leavePostService.selectLeavePostList(leavePost);
        return getDataTable(list);
    }

    /**
     * 导出leave_post列表
     */
    @PreAuthorize("@ss.hasPermi('function:leave_post:export')")
    @Log(title = "leave_post", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LeavePost leavePost)
    {
        List<LeavePost> list = leavePostService.selectLeavePostList(leavePost);
        ExcelUtil<LeavePost> util = new ExcelUtil<LeavePost>(LeavePost.class);
        util.exportExcel(response, list, "leave_post数据");
    }

    /**
     * 获取leave_post详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:leave_post:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(leavePostService.selectLeavePostById(id));
    }

    /**
     * 新增leave_post
     */
    @PreAuthorize("@ss.hasPermi('function:leave_post:add')")
    @Log(title = "leave_post", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LeavePost leavePost)
    {
        return toAjax(leavePostService.insertLeavePost(leavePost));
    }

    /**
     * 修改leave_post
     */
    @PreAuthorize("@ss.hasPermi('function:leave_post:edit')")
    @Log(title = "leave_post", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LeavePost leavePost)
    {
        return toAjax(leavePostService.updateLeavePost(leavePost));
    }

    /**
     * 删除leave_post
     */
    @PreAuthorize("@ss.hasPermi('function:leave_post:remove')")
    @Log(title = "leave_post", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(leavePostService.deleteLeavePostByIds(ids));
    }
}
