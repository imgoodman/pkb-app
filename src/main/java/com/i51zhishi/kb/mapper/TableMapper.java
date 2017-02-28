package com.i51zhishi.kb.mapper;

import com.i51zhishi.kb.entity.Table;
import java.util.List;

public interface TableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Table record);

    Table selectByPrimaryKey(Integer id);

    List<Table> selectAll();

    int updateByPrimaryKey(Table record);
}