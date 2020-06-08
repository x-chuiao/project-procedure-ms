package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.entity.Staff;
import top.xchuiao.projectprocedurems.service.AccountService;
import org.springframework.web.bind.annotation.*;
import top.xchuiao.projectprocedurems.service.ClientService;
import top.xchuiao.projectprocedurems.service.StaffService;
import top.xchuiao.projectprocedurems.utils.Responce;
import top.xchuiao.projectprocedurems.utils.util;


import javax.annotation.Resource;
import java.util.Map;


/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:52
 */
@RestController
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;
    @Resource
    private ClientService clientService;
    @Resource
    private StaffService staffService;


    @PostMapping("/login")
    public Responce login(String id, String pwd) {
        Responce responce = new Responce();
        Account account = this.accountService.queryById(id);
        if (account == null || !account.getPwd().equals(pwd)) {
            responce.code = "10001";
            responce.msg = "账密错误";
        } else
            responce.data = account;
        return responce;
    }
    @GetMapping("/accounts")
    public Responce Getallaccount()
    {
        Responce responce=new Responce();
        responce.data=this.accountService.queryAll();
        return responce;
    }
    @PostMapping("/basic-info")
    public Responce ModBasicInfo(@RequestParam Map<String, Object> info) {
        Responce responce=new Responce();
        int type=accountService.getAccountType((String)info.get("id"));
        if(type==1)
        {
            Staff staff=util.mapToBean(info,Staff.class);
            // System.out.println(staff);
            responce.data=staff;

        }
        else if(type==2)
        {
            Client client=util.mapToBean(info,Client.class);
            // System.out.println(staff);
            responce.data=client;
        }
        else
        {
            responce.code="10001";
            responce.msg="不存在";
        }
        return responce;
    }

    @GetMapping("/basic-info")
    public Responce getBasicInfo(@RequestParam(name = "id") String id) {
        Responce responce = new Responce();
        Object o=accountService.getAccountUser(id);
        if(o==null)
        {
            responce.code="10001";
            responce.msg="不存在此用户";
        }
        else
        {
            responce.data=o;
        }
        return responce;
    }

}