package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Account;
import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.entity.Staff;
import top.xchuiao.projectprocedurems.service.AccountService;
import org.springframework.web.bind.annotation.*;
import top.xchuiao.projectprocedurems.service.ClientService;
import top.xchuiao.projectprocedurems.service.StaffService;
import top.xchuiao.projectprocedurems.utils.Responce;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:52
 */
@RestController
@RequestMapping("account")
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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Account selectOne(String id) {
        return this.accountService.queryById(id);
    }
    @PostMapping("/login")
    public Responce login(String id, String pwd) {
        Responce responce=new Responce();
        Account account=this.accountService.queryById(id);
        if(account == null||!account.getPwd().equals(pwd))
        {
            responce.code="10001";
            responce.msg="账密错误";
        }
        else
            responce.data=account;
        return responce;
    }
    @PostMapping("/account")
    public Responce getAccount(String id) {
        Responce responce=new Responce();
        Client client=clientService.queryById(id);
        if(client==null)
        {
            Staff staff=staffService.queryById(id);
            if(staff==null)
            {
                responce.code="";
                responce.msg="不存在此用户";
                return responce;
            }
            else
                responce.data=staff;
        }
        else
            responce.data=client;
        return responce;
    }
    @GetMapping("/account")
    public Responce test( @RequestParam(name="id") String id,@PathVariable(name = "pwd") String pwd) {
        Responce responce=new Responce();


        Client client=clientService.queryById(id);
        if(client==null)
        {
            Staff staff=staffService.queryById(id);
            if(staff==null)
            {
                responce.code="";
                responce.msg="不存在此用户";
                return responce;
            }
            else
                responce.data=staff;
        }
        else
            responce.data=client;
        return responce;
    }
}