package com.i51zhishi.kb.service;

import com.i51zhishi.kb.entity.Column;

import java.util.List;

/**
 * Created by User on 2017/3/6.
 */
public interface ColumnService
{
    Column insert(Column column);

    Integer getNameEnCount(Column column);

    List<Column> getColumnsOfTable(Integer tableId);
}
