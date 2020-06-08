package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Projectmember;
import top.xchuiao.projectprocedurems.service.ProjectmemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Projectmember)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:57
 */
@RestController
@RequestMapping("projectmember")
public class ProjectmemberController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectmemberService projectmemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Projectmember selectOne(String id) {
        return this.projectmemberService.queryById(id);
    }

}