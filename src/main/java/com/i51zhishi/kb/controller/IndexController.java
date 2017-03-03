package com.i51zhishi.kb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 2017/3/2.
 */
@Controller
public class IndexController
{
    @RequestMapping("/index")
    public String index()
    {
        return "/tpls/index";
    }
}
