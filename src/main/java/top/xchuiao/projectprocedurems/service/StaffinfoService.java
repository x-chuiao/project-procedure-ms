package top.xchuiao.projectprocedurems.service;

import top.xchuiao.projectprocedurems.entity.Staffinfo;
import java.util.List;

/**
 * (Staffinfo)表服务接口
 *
 * @author makejava
 * @since 2020-06-13 17:01:15
 */
public interface StaffinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Staffinfo queryById( );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staffinfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param staffinfo 实例对象
     * @return 实例对象
     */
    Staffinfo insert(Staffinfo staffinfo);

    /**
     * 修改数据
     *
     * @param staffinfo 实例对象
     * @return 实例对象
     */
    Staffinfo update(Staffinfo staffinfo);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}