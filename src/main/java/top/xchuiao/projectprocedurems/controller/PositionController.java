package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Position;
import top.xchuiao.projectprocedurems.service.PositionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Position)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:56
 */
@RestController
@RequestMapping("position")
public class PositionController {
    /**
     * 服务对象
     */
    @Resource
    private PositionService positionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Position selectOne(String id) {
        return this.positionService.queryById(id);
    }

}