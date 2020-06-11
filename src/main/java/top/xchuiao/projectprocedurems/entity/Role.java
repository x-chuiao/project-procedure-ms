package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-06-11 19:04:19
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -53823150593807003L;
    
    private Integer rolId;
    
    private String rolName;


    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

}