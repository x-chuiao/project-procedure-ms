package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.service.ClientService;
import org.springframework.web.bind.annotation.*;
import top.xchuiao.projectprocedurems.utils.Responce;

import javax.annotation.Resource;

/**
 * (Client)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:47
 */
@RestController
public class ClientController {
    /**
     * 服务对象
     */
    @Resource
    private ClientService clientService;

    @GetMapping("/clients")
    public Responce getAllClients()
    {
        Responce responce=new Responce();
        responce.data=this.clientService.queryAll();
        return responce;
    }
}