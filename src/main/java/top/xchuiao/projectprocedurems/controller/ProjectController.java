package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Project;
import top.xchuiao.projectprocedurems.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Project)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:56
 */
@RestController
@RequestMapping("project")
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectService projectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Project selectOne(String id) {
        return this.projectService.queryById(id);
    }

}