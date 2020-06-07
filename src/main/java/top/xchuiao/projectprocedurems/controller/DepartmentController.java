package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Department;
import top.xchuiao.projectprocedurems.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Department)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:54
 */
@RestController
@RequestMapping("department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Department selectOne(String id) {
        return this.departmentService.queryById(id);
    }

}