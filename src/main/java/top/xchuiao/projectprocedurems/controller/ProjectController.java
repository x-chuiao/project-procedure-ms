package top.xchuiao.projectprocedurems.controller;

import top.xchuiao.projectprocedurems.entity.*;
import top.xchuiao.projectprocedurems.service.AccountService;
import top.xchuiao.projectprocedurems.service.ProjectService;
import org.springframework.web.bind.annotation.*;
import top.xchuiao.projectprocedurems.service.ProjectmemberService;
import top.xchuiao.projectprocedurems.utils.Responce;
import top.xchuiao.projectprocedurems.utils.util;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * (Project)表控制层
 *
 * @author makejava
 * @since 2020-06-06 17:59:56
 */
@RestController
public class ProjectController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectService projectService;
    @Resource
    private AccountService accountService;
     @Resource
    private ProjectmemberService projectmemberService;

    @GetMapping("/projects-info")
    public Responce getAllProject(@RequestParam String id) {
        Responce responce = Responce.getInstance();
        int type=accountService.getAccountType(id);
        List<Project> projects=null;
        if(type==1)
        {
            List<Projectmember> projectmembers= projectmemberService.queryAll(new Projectmember(){{setId(id);}});
            projects=this.projectService.queryAll(projectmembers.stream().map(Projectmember::getProId).collect(Collectors.toList()));
        }
        else if(type==2)
        {
            projects=this.projectService.queryAll(new Project(){{setCliId(id);}});
        }
        else
        {
            responce.msg="不存在此用户";
            responce.code="10001";
        }
        responce.data=projects;
        return responce;
    }

    @PostMapping("/projects-info")
    public Responce modAllPositions(@RequestParam Map<String,Object> data)
    {
        Responce responce=Responce.getInstance();
        responce.code="10002";
        responce.msg= util.ModTable(data,this.projectService, Project.class);
        return responce;
    }

}