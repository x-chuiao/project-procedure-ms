# edit by xchuiao
makejava="xchuiao"






    
    

package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2020-06-13 17:00:55
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -68992815613238054L;
    
    private Long accId;
    
    private Integer rolId;
    
    private String accPwd;
    
    private Integer accType;


    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getAccPwd() {
        return accPwd;
    }

    public void setAccPwd(String accPwd) {
        this.accPwd = accPwd;
    }

    public Integer getAccType() {
        return accType;
    }

    public void setAccType(Integer accType) {
        this.accType = accType;
    }

}