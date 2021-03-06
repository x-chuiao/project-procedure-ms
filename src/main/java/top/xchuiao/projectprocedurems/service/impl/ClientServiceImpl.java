package top.xchuiao.projectprocedurems.service.impl;

import top.xchuiao.projectprocedurems.entity.Client;
import top.xchuiao.projectprocedurems.dao.ClientDao;
import top.xchuiao.projectprocedurems.service.ClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Client)表服务实现类
 *
 * @author makejava
 * @since 2020-06-13 17:00:55
 */
@Service("clientService")
public class ClientServiceImpl implements ClientService {
    @Resource
    private ClientDao clientDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cliId 主键
     * @return 实例对象
     */
    @Override
    public Client queryById(Long cliId) {
        return this.clientDao.queryById(cliId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Client> queryAllByLimit(int offset, int limit) {
        return this.clientDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param client 实例对象
     * @return 实例对象
     */
    @Override
    public Client insert(Client client) {
        this.clientDao.insert(client);
        return client;
    }

    /**
     * 修改数据
     *
     * @param client 实例对象
     * @return 实例对象
     */
    @Override
    public Client update(Client client) {
        this.clientDao.update(client);
        return this.queryById(client.getCliId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cliId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long cliId) {
        return this.clientDao.deleteById(cliId) > 0;
    }
}