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
import com.ruoyi.function.domain.FunUser;
import com.ruoyi.function.service.IFunUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生信息Controller
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@RestController
@RequestMapping("/function/fun_user")
public class FunUserController extends BaseController
{
    @Autowired
    private IFunUserService funUserService;

    /**
     * 查询学生信息列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_user:list')")
    @GetMapping("/list")
    public TableDataInfo list(FunUser funUser)
    {
        startPage();
        List<FunUser> list = funUserService.selectFunUserList(funUser);
        return getDataTable(list);
    }

    /**
     * 导出学生信息列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_user:export')")
    @Log(title = "学生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FunUser funUser)
    {
        List<FunUser> list = funUserService.selectFunUserList(funUser);
        ExcelUtil<FunUser> util = new ExcelUtil<FunUser>(FunUser.class);
        util.exportExcel(response, list, "学生信息数据");
    }

    /**
     * 获取学生信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_user:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(funUserService.selectFunUserById(id));
    }

    /**
     * 新增学生信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_user:add')")
    @Log(title = "学生信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FunUser funUser)
    {
        return toAjax(funUserService.insertFunUser(funUser));
    }

    /**
     * 修改学生信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_user:edit')")
    @Log(title = "学生信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FunUser funUser)
    {
        return toAjax(funUserService.updateFunUser(funUser));
    }

    /**
     * 删除学生信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_user:remove')")
    @Log(title = "学生信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(funUserService.deleteFunUserByIds(ids));
    }
}
