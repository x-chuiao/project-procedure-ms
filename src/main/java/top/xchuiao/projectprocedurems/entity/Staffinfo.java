# edit by xchuiao
makejava="xchuiao"






    
    

package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Staffinfo)实体类
 *
 * @author makejava
 * @since 2020-06-13 17:01:15
 */
public class Staffinfo implements Serializable {
    private static final long serialVersionUID = 861766035910032561L;
    
    private Integer depId;
    
    private Integer posId;
    
    private Long staId;
    
    private Long accId;
    
    private String staName;
    
    private Integer staAge;
    
    private Integer staSex;
    
    private String staContact;
    
    private String posName;
    
    private String depName;


    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Long getStaId() {
        return staId;
    }

    public void setStaId(Long staId) {
        this.staId = staId;
    }

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public Integer getStaAge() {
        return staAge;
    }

    public void setStaAge(Integer staAge) {
        this.staAge = staAge;
    }

    public Integer getStaSex() {
        return staSex;
    }

    public void setStaSex(Integer staSex) {
        this.staSex = staSex;
    }

    public String getStaContact() {
        return staContact;
    }

    public void setStaContact(String staContact) {
        this.staContact = staContact;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

}