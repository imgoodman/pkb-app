package com.i51zhishi.kb.mapper;

import com.i51zhishi.kb.entity.Column;
import java.util.List;

public interface ColumnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Column record);

    Column selectByPrimaryKey(Integer id);

    List<Column> selectAll();

    int updateByPrimaryKey(Column record);
}