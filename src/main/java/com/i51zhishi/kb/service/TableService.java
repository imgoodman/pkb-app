package com.i51zhishi.kb.service;

import com.github.pagehelper.Page;
import com.i51zhishi.kb.entity.Table;
import com.i51zhishi.kb.vo.TableFilterVO;

/**
 * Created by User on 2017/3/3.
 */
public interface TableService
{
    Table create(Table table);

    Page<Table> selectAll(TableFilterVO tableFilterVO);

    Integer getTotal(TableFilterVO tableFilterVO);

    Integer getNameEnCount(String nameEn);
}
