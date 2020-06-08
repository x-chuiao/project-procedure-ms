package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Client)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:47
 */
public class Client implements Serializable {
    private static final long serialVersionUID = 561645970667430819L;
    
    private String id;
    
    private String accId;
    
    private String name;
    
    private String sex;
    
    private String contact;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}