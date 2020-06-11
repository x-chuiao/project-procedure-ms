package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Projectmember)实体类
 *
 * @author makejava
 * @since 2020-06-11 19:04:18
 */
public class Projectmember implements Serializable {
    private static final long serialVersionUID = -43591811670670578L;
    
    private Long proId;
    
    private Long staId;


    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public Long getStaId() {
        return staId;
    }

    public void setStaId(Long staId) {
        this.staId = staId;
    }

}