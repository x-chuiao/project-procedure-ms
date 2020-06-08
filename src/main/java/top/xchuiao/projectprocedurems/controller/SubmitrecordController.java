package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Submitrecord;
import top.xchuiao.projectprocedurems.service.SubmitrecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Submitrecord)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:59
 */
@RestController
@RequestMapping("submitrecord")
public class SubmitrecordController {
    /**
     * 服务对象
     */
    @Resource
    private SubmitrecordService submitrecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Submitrecord selectOne(String id) {
        return this.submitrecordService.queryById(id);
    }

}