package top.xchuiao.projectprocedurems.service;

import top.xchuiao.projectprocedurems.entity.Staff;
import java.util.List;

/**
 * (Staff)表服务接口
 *
 * @author makejava
 * @since 2020-06-06 17:59:58
 */
public interface StaffService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Staff queryById(String id);
    List<Staff> queryAll();
    List<Staff> queryAll(Staff staff);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staff> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    Staff insert(Staff staff);

    /**
     * 修改数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    Staff update(Staff staff);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}