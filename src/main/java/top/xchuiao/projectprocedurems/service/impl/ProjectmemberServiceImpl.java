package top.xchuiao.projectprocedurems.service.impl;

import top.xchuiao.projectprocedurems.entity.Projectmember;
import top.xchuiao.projectprocedurems.dao.ProjectmemberDao;
import top.xchuiao.projectprocedurems.service.ProjectmemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Projectmember)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 17:59:57
 */
@Service("projectmemberService")
public class ProjectmemberServiceImpl implements ProjectmemberService {
    @Resource
    private ProjectmemberDao projectmemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    @Override
    public Projectmember queryById(String proId) {
        return this.projectmemberDao.queryById(proId);
    }

    @Override
    public  List<Projectmember> queryAllPmember(String depId){
        return this.projectmemberDao.queryAllPmember(depId);
    }

    @Override
    public List<Projectmember> queryAll(Projectmember projectmember) {
        return this.projectmemberDao.queryAll(projectmember);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Projectmember> queryAllByLimit(int offset, int limit) {
        return this.projectmemberDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    @Override
    public Projectmember insert(Projectmember projectmember) {
        this.projectmemberDao.insert(projectmember);
        return projectmember;
    }

    /**
     * 修改数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    @Override
    public Projectmember update(Projectmember projectmember) {
        this.projectmemberDao.update(projectmember);
        return this.queryById(projectmember.getProId());
    }

    @Override
    public boolean deleteById(Projectmember projectmember) {
        return this.projectmemberDao.deleteById(projectmember) > 0;
    }
}