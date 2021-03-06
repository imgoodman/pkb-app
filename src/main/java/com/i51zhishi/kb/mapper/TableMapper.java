package com.i51zhishi.kb.mapper;

import com.i51zhishi.kb.entity.Table;
import com.i51zhishi.kb.vo.TableDataVO;
import com.i51zhishi.kb.vo.TableFilterVO;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableMapper {
    int deleteByPrimaryKey(Integer id);

    void insert(Table record);

    Table selectByPrimaryKey(Integer id);

    List<Table> selectAll(TableFilterVO tableFilterVO);

    List<TableDataVO> getAllTables();

    Integer getTotal(TableFilterVO tableFilterVO);

    int updateByPrimaryKey(Table record);

    Integer getNameEnCount(String nameEn);

    Integer isNameExist(Table table);
}