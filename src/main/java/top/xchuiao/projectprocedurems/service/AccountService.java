package top.xchuiao.projectprocedurems.service;

import top.xchuiao.projectprocedurems.entity.Account;
import java.util.List;

/**
 * (Account)表服务接口
 *
 * @author makejava
 * @since 2020-06-12 17:32:26
 */
public interface AccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param accId 主键
     * @return 实例对象
     */
    Account queryById(Long accId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Account> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    Account insert(Account account);

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    Account update(Account account);

    /**
     * 通过主键删除数据
     *
     * @param accId 主键
     * @return 是否成功
     */
    boolean deleteById(Long accId);

}