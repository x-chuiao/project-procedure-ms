package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Projectmember)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:57
 */
public class Projectmember implements Serializable {
    private static final long serialVersionUID = 357929775998933550L;
    
    private String proId;
    
    private String id;


    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}