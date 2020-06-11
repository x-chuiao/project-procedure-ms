package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Staffinfo;
import top.xchuiao.projectprocedurems.service.StaffinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Staffinfo)表控制层
 *
 * @author makejava
 * @since 2020-06-11 19:05:38
 */
@RestController
@RequestMapping("staffinfo")
public class StaffinfoController {
    /**
     * 服务对象
     */
    @Resource
    private StaffinfoService staffinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Staffinfo selectOne( id) {
        return this.staffinfoService.queryById(id);
    }

}