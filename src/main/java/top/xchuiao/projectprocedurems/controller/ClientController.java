package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.service.ClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Client)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:47
 */
@RestController
@RequestMapping("client")
public class ClientController {
    /**
     * 服务对象
     */
    @Resource
    private ClientService clientService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Client selectOne(String id) {
        return this.clientService.queryById(id);
    }

}