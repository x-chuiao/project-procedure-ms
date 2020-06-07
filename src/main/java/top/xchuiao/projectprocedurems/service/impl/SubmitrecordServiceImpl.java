package top.xchuiao.projectprocedurems.service.impl;

import top.xchuiao.projectprocedurems.entity.Submitrecord;
import top.xchuiao.projectprocedurems.dao.SubmitrecordDao;
import top.xchuiao.projectprocedurems.service.SubmitrecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Submitrecord)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 17:59:59
 */
@Service("submitrecordService")
public class SubmitrecordServiceImpl implements SubmitrecordService {
    @Resource
    private SubmitrecordDao submitrecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    @Override
    public Submitrecord queryById(String proId) {
        return this.submitrecordDao.queryById(proId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Submitrecord> queryAllByLimit(int offset, int limit) {
        return this.submitrecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    @Override
    public Submitrecord insert(Submitrecord submitrecord) {
        this.submitrecordDao.insert(submitrecord);
        return submitrecord;
    }

    /**
     * 修改数据
     *
     * @param submitrecord 实例对象
     * @return 实例对象
     */
    @Override
    public Submitrecord update(Submitrecord submitrecord) {
        this.submitrecordDao.update(submitrecord);
        return this.queryById(submitrecord.getProId());
    }

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String proId) {
        return this.submitrecordDao.deleteById(proId) > 0;
    }
}