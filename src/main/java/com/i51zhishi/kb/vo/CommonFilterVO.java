package com.i51zhishi.kb.vo;

import java.io.Serializable;

/**
 * Created by User on 2017/3/3.
 */
public class CommonFilterVO implements Serializable
{
    private String orderBy;
    private String orderType;
    private Integer pageIndex;
    private Integer pageSize;

    public String getOrderBy()
    {
        return orderBy;
    }

    public void setOrderBy(String orderBy)
    {
        this.orderBy = orderBy;
    }

    public String getOrderType()
    {
        return orderType;
    }

    public void setOrderType(String orderType)
    {
        this.orderType = orderType;
    }

    public Integer getPageIndex()
    {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex)
    {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }
}
