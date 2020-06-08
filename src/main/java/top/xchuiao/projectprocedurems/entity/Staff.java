package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Staff)实体类
 *
 * @author makejava
 * @since 2020-06-06 17:59:58
 */
public class Staff implements Serializable {
    private static final long serialVersionUID = 391729406711300250L;
    
    private String id;
    
    private String posId;
    
    private String depId;
    
    private String accId;
    
    private String name;
    
    private Integer age;
    
    private String sex;
    
    private String contact;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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