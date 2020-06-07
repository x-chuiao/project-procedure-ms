package top.xchuiao.projectprocedurems.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Submitrecord)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:59
 */
public class Submitrecord implements Serializable {
    private static final long serialVersionUID = 251761078072839341L;
    
    private String proId;
    
    private String staId;
    
    private String id;
    
    private String intro;
    
    private Date submitTime;
    
    private Integer directorAudit;
    
    private String directorComment;
    
    private String clientComment;


    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getStaId() {
        return staId;
    }

    public void setStaId(String staId) {
        this.staId = staId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getDirectorAudit() {
        return directorAudit;
    }

    public void setDirectorAudit(Integer directorAudit) {
        this.directorAudit = directorAudit;
    }

    public String getDirectorComment() {
        return directorComment;
    }

    public void setDirectorComment(String directorComment) {
        this.directorComment = directorComment;
    }

    public String getClientComment() {
        return clientComment;
    }

    public void setClientComment(String clientComment) {
        this.clientComment = clientComment;
    }

}