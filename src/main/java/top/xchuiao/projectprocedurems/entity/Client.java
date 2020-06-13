# edit by xchuiao
makejava="xchuiao"






    
    

package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Client)实体类
 *
 * @author makejava
 * @since 2020-06-13 17:00:55
 */
public class Client implements Serializable {
    private static final long serialVersionUID = 403173375752535407L;
    
    private Long cliId;
    
    private Long accId;
    
    private String cliName;
    
    private Integer cliSex;
    
    private String cliContact;


    public Long getCliId() {
        return cliId;
    }

    public void setCliId(Long cliId) {
        this.cliId = cliId;
    }

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getCliName() {
        return cliName;
    }

    public void setCliName(String cliName) {
        this.cliName = cliName;
    }

    public Integer getCliSex() {
        return cliSex;
    }

    public void setCliSex(Integer cliSex) {
        this.cliSex = cliSex;
    }

    public String getCliContact() {
        return cliContact;
    }

    public void setCliContact(String cliContact) {
        this.cliContact = cliContact;
    }

}