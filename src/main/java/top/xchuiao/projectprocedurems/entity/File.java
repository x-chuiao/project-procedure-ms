package top.xchuiao.projectprocedurems.entity;

import java.io.Serializable;

/**
 * (File)实体类
 *
 * @author makejava
 * @since 2020-06-11 19:04:14
 */
public class File implements Serializable {
    private static final long serialVersionUID = -77235148387666622L;
    
    private Long fileId;
    
    private Long subId;
    
    private String fileName;
    
    private String fileRealName;
    
    private Integer fileType;


    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileRealName() {
        return fileRealName;
    }

    public void setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

}