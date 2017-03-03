package com.i51zhishi.kb.service.impl;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.i51zhishi.kb.entity.Table;
import com.i51zhishi.kb.mapper.TableMapper;
import com.i51zhishi.kb.service.TableService;
import com.i51zhishi.kb.vo.TableFilterVO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by User on 2017/3/3.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TableServiceImpl implements TableService
{
    private Log log= LogFactory.getLog(TableService.class);

    @Autowired
    private TableMapper tableMapper;

    public Table create(Table table)
    {
        log.debug(table);
        tableMapper.insert(table);
        return tableMapper.selectByPrimaryKey(table.getId());
    }

    public Page<Table> selectAll(final TableFilterVO tableFilterVO)
    {
        if(tableFilterVO.getPageIndex()==null){
            tableFilterVO.setPageIndex(0);
        }
        if(tableFilterVO.getPageSize()==null){
            tableFilterVO.setPageSize(10);
        }
        return PageHelper.startPage(tableFilterVO.getPageIndex(), tableFilterVO.getPageSize()).doSelectPage(new ISelect()
        {
            public void doSelect()
            {
                tableMapper.selectAll(tableFilterVO);
            }
        });
    }

    public Integer getTotal(TableFilterVO tableFilterVO)
    {
        return tableMapper.getTotal(tableFilterVO);
    }
}
