package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.Account;
import top.xchuiao.projectprocedurems.entity.Projectmember;
import top.xchuiao.projectprocedurems.service.DepartmentService;
import top.xchuiao.projectprocedurems.service.ProjectmemberService;
import org.springframework.web.bind.annotation.*;
import top.xchuiao.projectprocedurems.service.StaffService;
import top.xchuiao.projectprocedurems.utils.Responce;
import top.xchuiao.projectprocedurems.utils.util;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Projectmember)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:57
 */
@RestController
public class ProjectmemberController {
    /**
     * 服务对象
     */

    @Resource
    private StaffService staffService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private ProjectmemberService projectmemberService;

    @GetMapping("/projects-member")
    public Responce getAllProjectMember(@RequestParam("dep_id") String id){

        Responce responce = new Responce();

        List<Projectmember> projectmember= projectmemberService.queryAllPmember(id);
        if(projectmember==null)
        {
            responce.code="10001";
            responce.msg="不存在此成员";
        }
        else
        {
            responce.data=projectmember;
        }
        return responce;
    }
    @PostMapping("/projects-member")
    public Responce modAllProjectMember(@RequestParam Map<String,Object> data){
        // add:[{"pro_id":"","id":""},{"pro_id":"","id":""}，{"pro_id":"","id":""}]
        // del:[{"pro_id":"","id":""},{"pro_id":"","id":""}，{"pro_id":"","id":""}]
        Responce responce = new Responce();
        responce.code="10002";
        responce.msg=util.ModTable(data,this.projectmemberService, Projectmember.class,Projectmember.class);
        return responce;
    }
}