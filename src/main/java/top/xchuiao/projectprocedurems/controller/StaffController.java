package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.entity.Staff;
import top.xchuiao.projectprocedurems.service.StaffService;
import org.springframework.web.bind.annotation.*;
import top.xchuiao.projectprocedurems.utils.Responce;
import top.xchuiao.projectprocedurems.utils.util;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (Staff)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:58
 */
@RestController
public class StaffController {
    /**
     * 服务对象
     */
    @Resource
    private StaffService staffService;

    @GetMapping("/staffs")
    public Responce getAllStaffs()
    {
        Responce responce=new Responce();
        responce.data=this.staffService.queryAll();
        return responce;
    }
    @PostMapping("/staffs")
    public Responce modAllStaffs(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg= util.ModTable(data,this.staffService, Staff.class);
        return responce;
    }
}