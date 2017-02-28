package com.i51zhishi.kb.entity;

import java.util.Date;

public class Column {
    private Integer id;

    private Integer tableId;

    private String nameCn;

    private String nameEn;

    private Integer valueType;

    private Boolean isRequired;

    private Boolean canRepeat;

    private Integer orderIndex;

    private Boolean canSearch;

    private Long creatorId;

    private Date createTime;

    private String remarks;

    private Integer valueMaxLength;

    private Integer valueTableId;

    private Integer valueTableColumnId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
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

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public Boolean getCanRepeat() {
        return canRepeat;
    }

    public void setCanRepeat(Boolean canRepeat) {
        this.canRepeat = canRepeat;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public Boolean getCanSearch() {
        return canSearch;
    }

    public void setCanSearch(Boolean canSearch) {
        this.canSearch = canSearch;
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

    public Integer getValueMaxLength() {
        return valueMaxLength;
    }

    public void setValueMaxLength(Integer valueMaxLength) {
        this.valueMaxLength = valueMaxLength;
    }

    public Integer getValueTableId() {
        return valueTableId;
    }

    public void setValueTableId(Integer valueTableId) {
        this.valueTableId = valueTableId;
    }

    public Integer getValueTableColumnId() {
        return valueTableColumnId;
    }

    public void setValueTableColumnId(Integer valueTableColumnId) {
        this.valueTableColumnId = valueTableColumnId;
    }
}