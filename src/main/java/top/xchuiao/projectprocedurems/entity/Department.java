package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:52
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 570690262685596328L;
    
    private String id;
    
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}