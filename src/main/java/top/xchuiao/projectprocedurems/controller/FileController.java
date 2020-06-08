package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.File;
import top.xchuiao.projectprocedurems.service.FileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (File)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:55
 */
@RestController
@RequestMapping("file")
public class FileController {
    /**
     * 服务对象
     */
    @Resource
    private FileService fileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public File selectOne(String id) {
        return this.fileService.queryById(id);
    }

}