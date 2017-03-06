package com.i51zhishi.kb.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by User on 2017/3/6.
 */
public class TableDataVO implements Serializable
{
    private Integer id;
    private String nameCn;
    private String nameEn;
    private String remarks;

    private List<ColumnDataVO> columns;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
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

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public List<ColumnDataVO> getColumns()
    {
        return columns;
    }

    public void setColumns(List<ColumnDataVO> columns)
    {
        this.columns = columns;
    }
}
