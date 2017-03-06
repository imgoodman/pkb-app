package com.i51zhishi.kb.mapper;

import com.i51zhishi.kb.entity.Column;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColumnMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Column record);

    Column selectByPrimaryKey(Integer id);

    List<Column> selectAll(Integer id);

    int updateByPrimaryKey(Column record);

    Integer isNameExist(Column column);

    Integer getNameEnCount(Column column);
}