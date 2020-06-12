package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Position)实体类
 *
 * @author makejava
 * @since 2020-06-12 17:32:32
 */
public class Position implements Serializable {
    private static final long serialVersionUID = 203129646092918791L;
    
    private Integer posId;
    
    private String posName;


    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

}