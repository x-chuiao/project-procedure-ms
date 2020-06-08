package top.xchuiao.projectprocedurems.service.impl;

import top.xchuiao.projectprocedurems.dao.AccountDao;
import top.xchuiao.projectprocedurems.entity.Account;
import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.entity.Staff;
import top.xchuiao.projectprocedurems.service.AccountService;
import org.springframework.stereotype.Service;
import top.xchuiao.projectprocedurems.service.ClientService;
import top.xchuiao.projectprocedurems.service.StaffService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 17:59:52
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;
     @Resource
    private ClientService clientService;
    @Resource
    private StaffService staffService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Account queryById(String id) {
        return this.accountDao.queryById(id);
    }

    @Override
    public List<Account> queryAll() {
        return this.accountDao.queryAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Account> queryAllByLimit(int offset, int limit) {
        return this.accountDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account insert(Account account) {
        this.accountDao.insert(account);
        return account;
    }

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account update(Account account) {
        this.accountDao.update(account);
        return this.queryById(account.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.accountDao.deleteById(id) > 0;
    }

    @Override
    public Object getAccountUser(String acc_id)
    {
        Account account=accountDao.queryById(acc_id);
        if(account==null)
            return null;
        List<Staff> staffs=staffService.queryAll(new Staff(){{setAccId(acc_id);}});
        if(!staffs.isEmpty())
            return staffs.stream().findAny();
        List<Client> clients = clientService.queryAll(new Client(){{setAccId(acc_id);}});
        if (!clients.isEmpty())
            return  clients.stream().findAny();
        return null;
    }

    /**
     *
     * @param acc_id
     * @return 0表示不存在,1表示员工,2表示客户,3表示未使用
     */
    @Override
    public int getAccountType(String acc_id)
    {
        if(accountDao.queryById(acc_id)==null)
            return 0;
        List<Staff> staffs=staffService.queryAll(new Staff(){{setAccId(acc_id);}});
        if(!staffs.isEmpty())
            return 1;
        List<Client> clients = clientService.queryAll(new Client(){{setAccId(acc_id);}});
        if (!clients.isEmpty())
            return  2;
        return 3;
    }

}