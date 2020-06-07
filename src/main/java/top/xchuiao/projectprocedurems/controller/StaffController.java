package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Staff;
import top.xchuiao.projectprocedurems.service.StaffService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Staff)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:58
 */
@RestController
@RequestMapping("staff")
public class StaffController {
    /**
     * 服务对象
     */
    @Resource
    private StaffService staffService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Staff selectOne(String id) {
        return this.staffService.queryById(id);
    }

}