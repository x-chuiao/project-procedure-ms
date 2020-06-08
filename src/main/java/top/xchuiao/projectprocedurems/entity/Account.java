package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:52
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -68038851726138850L;
    
    private String id;
    
    private String rolId;
    
    private String pwd;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRolId() {
        return rolId;
    }

    public void setRolId(String rolId) {
        this.rolId = rolId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}