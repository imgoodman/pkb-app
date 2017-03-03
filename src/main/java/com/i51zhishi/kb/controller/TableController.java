package com.i51zhishi.kb.controller;

import com.i51zhishi.kb.entity.Table;
import com.i51zhishi.kb.service.TableService;
import com.i51zhishi.kb.vo.JsonResult;
import com.i51zhishi.kb.vo.TableFilterVO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by User on 2017/3/2.
 */
@Controller
@RequestMapping("/table")
public class TableController
{
    private Log log= LogFactory.getLog(TableController.class);

    @Autowired
    private TableService tableService;

    @RequestMapping("/list")
    public String list()
    {
        return "/tpls/vue/table/list";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public JsonResult insert(Table table)
    {
        log.debug("name cn:"+table.getNameCn()+";name en:"+table.getNameEn()+"; remarks:"+table.getRemarks());
        JsonResult result=new JsonResult();
        result.setSuccess(true);
        table.setCreatorId(Long.parseLong("1"));
        table= tableService.create(table);
        result.setExtendData(table);
        return result;
    }

    @RequestMapping("/data")
    @ResponseBody
    public JsonResult data(TableFilterVO tableFilterVO)
    {
        log.debug("filterName: "+tableFilterVO.getFilterName()+"; order by:" + tableFilterVO.getOrderBy()+" "+tableFilterVO.getOrderType()+"; pagesize: "+tableFilterVO.getPageSize().toString()+"; page index:"+tableFilterVO.getPageIndex().toString());
        JsonResult result=new JsonResult(true);
        result.setExtendData(tableService.selectAll(tableFilterVO));
        return result;
    }

    @RequestMapping("/total")
    @ResponseBody
    public JsonResult total(TableFilterVO tableFilterVO)
    {
        log.debug("filterName: "+tableFilterVO.getFilterName());
        JsonResult result=new JsonResult(true);
        result.setExtendData(tableService.getTotal(tableFilterVO));
        return result;
    }
}
