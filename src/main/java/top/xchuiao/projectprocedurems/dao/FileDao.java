package top.xchuiao.projectprocedurems.dao;

import top.xchuiao.projectprocedurems.entity.File;
import org.apache.ibatis.annotations.Param;
import top.xchuiao.projectprocedurems.entity.Projectmember;

import java.util.List;

/**
 * (File)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-06 17:59:55
 */
public interface FileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param name 主键
     * @return 实例对象
     */
    File queryById(String name);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<File> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param file 实例对象
     * @return 对象列表
     */
    List<File> queryAll(File file);

    /**
     * 新增数据
     *
     * @param file 实例对象
     * @return 影响行数
     */
    int insert(File file);

    /**
     * 修改数据
     *
     * @param file 实例对象
     * @return 影响行数
     */
    int update(File file);

    /**
     * 通过主键删除数据
     *
     * @param name 主键
     * @return 影响行数
     */
    int deleteById(String name);

    List<File> queryAllPfile(String proId);
}