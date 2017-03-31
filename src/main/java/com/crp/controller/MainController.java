package com.crp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ms-eureka - com.crp.controller
 *
 * @author superChen
 * @create 2017-03-30 13:34
 */
@RestController
@Slf4j
public class MainController {

    @RequestMapping("/index")
    public String welcomeIndex(){
        return "hello java";
    }



}
