package top.xchuiao.projectprocedurems.service;

import top.xchuiao.projectprocedurems.entity.Submitrecord;
import java.util.List;

/**
 * (Submitrecord)表服务接口
 *
 * @author makejava
 * @since 2020-06-06 17:59:59
 */
public interface SubmitrecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    Submitrecord queryById(String proId);
    List<Submitrecord> queryByStaId(String staId);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Submitrecord> queryAllByLimit(int offset, int limit);
    List<Submitrecord> queryByDaudit(int directorAudit);
    /**
     * 新增数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    Submitrecord insert(Submitrecord submitrecord);

    /**
     * 修改数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    Submitrecord update(Submitrecord submitrecord);

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 是否成功
     */
    boolean deleteById(String proId);

}