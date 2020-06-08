package top.xchuiao.projectprocedurems.dao;

import top.xchuiao.projectprocedurems.entity.Projectmember;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Projectmember)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-06 17:59:57
 */
public interface ProjectmemberDao {

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    Projectmember queryById(String proId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Projectmember> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param projectmember 实例对象
     * @return 对象列表
     */
    List<Projectmember> queryAll(Projectmember projectmember);

    /**
     * 新增数据
     *
     * @param projectmember 实例对象
     * @return 影响行数
     */
    int insert(Projectmember projectmember);

    /**
     * 修改数据
     *
     * @param projectmember 实例对象
     * @return 影响行数
     */
    int update(Projectmember projectmember);

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 影响行数
     */
    int deleteById(String proId);

}