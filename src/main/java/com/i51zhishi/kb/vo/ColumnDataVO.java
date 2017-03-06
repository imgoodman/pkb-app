package com.i51zhishi.kb.vo;

import java.io.Serializable;

/**
 * Created by User on 2017/3/6.
 */
public class ColumnDataVO implements Serializable
{
    private Integer id;
    private Integer tableId;
    private String tableName;
    private String nameCn;
    private String nameEn;
    private Integer valueType;
    private Boolean isRequired;
    private Boolean canRepeat;
    private Boolean canSearch;
    private Boolean onlySingleValue;
    private String remarks;
    private Integer valueMaxLength;
    private Integer valueTableId;
    private String valueTableName;
    private Integer valueTableColumnId;
    private String valueTableColumnName;
    private String info;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getTableId()
    {
        return tableId;
    }

    public void setTableId(Integer tableId)
    {
        this.tableId = tableId;
    }

    public String getTableName()
    {
        return tableName;
    }

    public Boolean getOnlySingleValue()
    {
        return onlySingleValue;
    }

    public void setOnlySingleValue(Boolean onlySingleValue)
    {
        this.onlySingleValue = onlySingleValue;
    }

    public void setTableName(String tableName)
    {
        this.tableName = tableName;
    }

    public String getNameCn()
    {
        return nameCn;
    }

    public void setNameCn(String nameCn)
    {
        this.nameCn = nameCn;
    }

    public String getNameEn()
    {
        return nameEn;
    }

    public void setNameEn(String nameEn)
    {
        this.nameEn = nameEn;
    }

    public Integer getValueType()
    {
        return valueType;
    }

    public void setValueType(Integer valueType)
    {
        this.valueType = valueType;
    }

    public Boolean getRequired()
    {
        return isRequired;
    }

    public void setRequired(Boolean required)
    {
        isRequired = required;
    }

    public Boolean getCanRepeat()
    {
        return canRepeat;
    }

    public void setCanRepeat(Boolean canRepeat)
    {
        this.canRepeat = canRepeat;
    }

    public Boolean getCanSearch()
    {
        return canSearch;
    }

    public void setCanSearch(Boolean canSearch)
    {
        this.canSearch = canSearch;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public Integer getValueMaxLength()
    {
        return valueMaxLength;
    }

    public void setValueMaxLength(Integer valueMaxLength)
    {
        this.valueMaxLength = valueMaxLength;
    }

    public Integer getValueTableId()
    {
        return valueTableId;
    }

    public void setValueTableId(Integer valueTableId)
    {
        this.valueTableId = valueTableId;
    }

    public Integer getValueTableColumnId()
    {
        return valueTableColumnId;
    }

    public void setValueTableColumnId(Integer valueTableColumnId)
    {
        this.valueTableColumnId = valueTableColumnId;
    }

    public String getValueTableName()
    {
        return valueTableName;
    }

    public void setValueTableName(String valueTableName)
    {
        this.valueTableName = valueTableName;
    }

    public String getValueTableColumnName()
    {
        return valueTableColumnName;
    }

    public void setValueTableColumnName(String valueTableColumnName)
    {
        this.valueTableColumnName = valueTableColumnName;
    }

    public String getInfo()
    {
        return (this.isRequired ? "必填;" : "非必填;")+(this.canRepeat ? "取值允许重复;" : "取值不允许重复;")+(this.canSearch ? "允许作为搜索条件;" : "不允许作为搜索条件;")+(this.onlySingleValue ? "仅允许单值;" : "可允许多值;")+(this.valueTableName=="" ? "" : (this.valueTableName+","+this.valueTableColumnName+";") );
    }

    public void setInfo(String info)
    {
        this.info = info;
    }
}
