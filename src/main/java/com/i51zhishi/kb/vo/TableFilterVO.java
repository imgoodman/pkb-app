package com.i51zhishi.kb.vo;

import java.io.Serializable;

/**
 * Created by User on 2017/3/3.
 */
public class TableFilterVO extends CommonFilterVO implements Serializable
{
    private String filterName;
    private Integer state;

    public String getFilterName()
    {
        return filterName;
    }

    public void setFilterName(String filterName)
    {
        this.filterName = filterName;
    }

    public Integer getState()
    {
        return state;
    }

    public void setState(Integer state)
    {
        this.state = state;
    }
}
