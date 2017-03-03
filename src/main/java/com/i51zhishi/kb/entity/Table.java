package com.i51zhishi.kb.entity;

import java.io.Serializable;
import java.util.Date;

public class Table implements Serializable
{
    private Integer id;

    private String nameCn;

    private String nameEn;

    private Long creatorId;

    private Date createTime;

    private String remarks;

    private Boolean state;

    private Date pageGenerateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getPageGenerateTime() {
        return pageGenerateTime;
    }

    public void setPageGenerateTime(Date pageGenerateTime) {
        this.pageGenerateTime = pageGenerateTime;
    }
}