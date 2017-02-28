package com.i51zhishi.kb.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 2017/2/28.
 */
@Controller
@RequestMapping("/home")
public class TestController
{
    private static Log log= LogFactory.getLog(TestController.class);
    @RequestMapping("/index")
    public String index()
    {
        log.debug("asas");
        return "index";
    }
}
