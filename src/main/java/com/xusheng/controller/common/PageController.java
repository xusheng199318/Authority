package com.xusheng.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xusheng on 2017/10/26.
 */
@Controller
public class PageController {

    @RequestMapping(value = "/goto/{pageName}")
    public String gotoPage(@PathVariable String pageName) {
        return pageName;
    }
}
