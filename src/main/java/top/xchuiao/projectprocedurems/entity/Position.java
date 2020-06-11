package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Position)实体类
 *
 * @author makejava
 * @since 2020-06-11 19:04:15
 */
public class Position implements Serializable {
    private static final long serialVersionUID = 444335182023863005L;
    
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