package top.xchuiao.projectprocedurems.service;

import top.xchuiao.projectprocedurems.entity.Projectmember;
import java.util.List;

/**
 * (Projectmember)表服务接口
 *
 * @author makejava
 * @since 2020-06-06 17:59:57
 */
public interface ProjectmemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    Projectmember queryById(String proId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Projectmember> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    Projectmember insert(Projectmember projectmember);

    /**
     * 修改数据
     *
     * @param projectmember 实例对象
     * @return 实例对象
     */
    Projectmember update(Projectmember projectmember);

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 是否成功
     */
    boolean deleteById(String proId);

}