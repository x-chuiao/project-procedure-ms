# edit by xchuiao
makejava="xchuiao"






    
    

package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2020-06-13 17:00:55
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 746912312275707054L;
    
    private Integer depId;
    
    private String depName;


    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

}