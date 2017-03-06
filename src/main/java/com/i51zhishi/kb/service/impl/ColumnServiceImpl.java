package com.i51zhishi.kb.service.impl;

import com.i51zhishi.kb.entity.Column;
import com.i51zhishi.kb.mapper.ColumnMapper;
import com.i51zhishi.kb.service.ColumnService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 2017/3/6.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ColumnServiceImpl implements ColumnService
{
    private Log log= LogFactory.getLog(ColumnService.class);

    @Autowired
    private ColumnMapper columnMapper;

    public Column insert(Column column)
    {
        if(columnMapper.isNameExist(column)>0){
            log.debug("name cn:"+column.getNameCn()+" of table: "+column.getTableId()+" already exists");
            return null;
        }
        if(column.getId()==null){
            columnMapper.insert(column);
        }else{
            columnMapper.updateByPrimaryKey(column);
        }
        return columnMapper.selectByPrimaryKey(column.getId());
    }

    public Integer getNameEnCount(Column column)
    {
        return columnMapper.getNameEnCount(column);
    }

    public List<Column> getColumnsOfTable(Integer tableId)
    {
        return columnMapper.selectAll(tableId);
    }
}
