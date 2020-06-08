package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (File)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:55
 */
public class File implements Serializable {
    private static final long serialVersionUID = -43121054600511832L;
    
    private String name;
    
    private String path;
    
    private String id;
    
    private Integer type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}