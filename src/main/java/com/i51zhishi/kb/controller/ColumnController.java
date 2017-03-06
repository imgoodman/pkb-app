package com.i51zhishi.kb.controller;

import com.i51zhishi.kb.entity.Column;
import com.i51zhishi.kb.service.ColumnService;
import com.i51zhishi.kb.util.PinyinUtil;
import com.i51zhishi.kb.vo.JsonResult;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by User on 2017/3/6.
 */
@Controller
@RequestMapping("/column")
public class ColumnController
{
    private Log log= LogFactory.getLog(ColumnController.class);

    @Autowired
    private ColumnService columnService;

    @RequestMapping("/insert")
    @ResponseBody
    public JsonResult insert(Column column)
    {
        log.debug("table id: "+column.getTableId()+", name cn: "+column.getNameCn()+", name en:"+column.getNameEn());
        column.setCreatorId(Long.parseLong("1"));
        column= columnService.insert(column);
        JsonResult result=new JsonResult(true);
        if(column==null){
            result.setSuccess(false);
        }else{
            result.setExtendData(column);
        }
        return result;
    }

    @RequestMapping("/data")
    @ResponseBody
    public JsonResult data(Integer tableId)
    {
        JsonResult result=new JsonResult(true);
        if(tableId!=null) {
            result.setExtendData(columnService.getColumnsOfTable(tableId));
        }else{
            result.setExtendData(null);
        }
        return result;
    }

    @RequestMapping("/pinyin")
    @ResponseBody
    public JsonResult pinyin(Column column)
    {
        log.debug("cn name is:"+column.getNameCn()+" in table: "+column.getTableId());
        JsonResult result=new JsonResult(true);
        if(StringUtils.isNotBlank(column.getNameCn())) {
            String hanyuPinyinName = PinyinUtil.converterToFirstSpell(column.getNameCn());
            Integer count = columnService.getNameEnCount(column);
            result.setExtendData(hanyuPinyinName + "_" + (count + 1));
        }else{
            result.setExtendData("");
        }
        return result;
    }
}
