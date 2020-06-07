package top.xchuiao.projectprocedurems.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Project)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:56
 */
public class Project implements Serializable {
    private static final long serialVersionUID = 247394473062515071L;
    
    private String id;
    
    private String cliId;
    
    private String name;
    
    private Date setupTime;
    
    private String intro;
    
    private Integer state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}