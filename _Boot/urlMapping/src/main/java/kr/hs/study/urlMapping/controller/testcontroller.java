package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class testcontroller {


    // test으로 post방식으로 요청했을 때 *.html을 실행해라
    @PostMapping("/sub1/test6")
    public String test6(){
        return "test6";
    }

    @RequestMapping(value = "/test1", method= RequestMethod.GET)
    public String test1() {
        return "test1";
    }
    @RequestMapping(value = "/test2", method= RequestMethod.GET)
    public String test2() {
        return "test2";
    }
    @RequestMapping(value = "/sub1/test3", method= RequestMethod.GET)
    public String test3() {
        return "/sub1/test3";
    }
    @RequestMapping(value = "/sub1/test4", method= RequestMethod.GET)
    public String test4() {
        return "/sub1/test4";
    }
    @RequestMapping(value = "/sub1/test5", method= RequestMethod.GET)
    public String test5() {
        return "/sub1/test5";
    }
}
