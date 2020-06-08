package top.xchuiao.projectprocedurems.service;

import top.xchuiao.projectprocedurems.entity.File;
import java.util.List;

/**
 * (File)表服务接口
 *
 * @author makejava
 * @since 2020-06-06 17:59:55
 */
public interface FileService {

    /**
     * 通过ID查询单条数据
     *
     * @param name 主键
     * @return 实例对象
     */
    File queryById(String name);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<File> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    File insert(File file);

    /**
     * 修改数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    File update(File file);

    /**
     * 通过主键删除数据
     *
     * @param name 主键
     * @return 是否成功
     */
    boolean deleteById(String name);

}