package top.xchuiao.projectprocedurems.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import top.xchuiao.projectprocedurems.entity.Account;
import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.entity.Position;
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
    Object GetAccountUser(String id)
    {
        Client client = clientService.queryById(id);
        if (client == null) {
            Staff staff = staffService.queryById(id);
            if (staff == null) {
                return null;
            } else
                return staff;
        } else
            return client;
    }
    int GetAccountType(String id)
    {
        Client client = clientService.queryById(id);
        if (client == null) {
            Staff staff = staffService.queryById(id);
            if (staff == null) {
                return 0;
            } else
                return 1;
        } else
            return 2;
    }

    @PostMapping("/login")
    public Responce login(String id, String pwd) {
        Responce responce = new Responce();
        Account account = this.accountService.queryById(id);
        if (account == null || !account.getPwd().equals(id) ){
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
    @PostMapping("/account")
    public Responce modAccount(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        Account account = this.accountService.queryById((String)data.get("id"));
        if (account == null || !account.getPwd().equals((String)data.get("org_pwd"))) {
            responce.code = "10001";
            responce.msg = "密码错误";
        } else
        this.accountService.update(new Account(){{setId((String)data.get("id"));setPwd((String)data.get("new_pwd"));}});
        return responce;
    }

    @PostMapping("/accounts")
    public Responce modAllAccounts(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg=util.ModTable(data,this.accountService,Account.class);
        return responce;
    }

    @PostMapping("/basic-info")
    public Responce ModBasicInfo(@RequestParam Map<String, Object> info) {
        Responce responce=new Responce();
        int type=GetAccountType((String)info.get("id"));
        if(type==1)
        {
            Staff staff=util.mapToBean(info,Staff.class);
            this.staffService.update(staff);
            // System.out.println(staff);
            responce.data=staff;

        }
        else if(type==2)
        {
            Client client=util.mapToBean(info,Client.class);
            this.clientService.update(client);
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
        Object o=GetAccountUser(id);
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