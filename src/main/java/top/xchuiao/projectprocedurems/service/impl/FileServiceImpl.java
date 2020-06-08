package top.xchuiao.projectprocedurems.service.impl;

import top.xchuiao.projectprocedurems.entity.File;
import top.xchuiao.projectprocedurems.dao.FileDao;
import top.xchuiao.projectprocedurems.entity.Projectmember;
import top.xchuiao.projectprocedurems.service.FileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (File)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 17:59:55
 */
@Service("fileService")
public class FileServiceImpl implements FileService {
    @Resource
    private FileDao fileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param name 主键
     * @return 实例对象
     */
    @Override
    public File queryById(String name) {
        return this.fileDao.queryById(name);
    }

    @Override
    public  List<File> queryAllPfile(String proId){
        return this.fileDao.queryAllPfile(proId);
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<File> queryAllByLimit(int offset, int limit) {
        return this.fileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    @Override
    public File insert(File file) {
        this.fileDao.insert(file);
        return file;
    }

    /**
     * 修改数据
     *
     * @param file 实例对象
     * @return 实例对象
     */
    @Override
    public File update(File file) {
        this.fileDao.update(file);
        return this.queryById(file.getName());
    }

    /**
     * 通过主键删除数据
     *
     * @param name 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String name) {
        return this.fileDao.deleteById(name) > 0;
    }
}