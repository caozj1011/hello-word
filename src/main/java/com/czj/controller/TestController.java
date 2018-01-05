package com.czj.controller;

import com.czj.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by caozhiia on 2018/1/5.
 */
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;



    @RequestMapping("/hello")
    public String toHello(){
        List<Map<String, Object>> maps = helloService.toQuery("select * from exam;");
        System.out.println(maps);
        System.out.println(DataSource.class.getName());
        return "hello";
    }
    @RequestMapping("/insert")
    public String insert(){
        int result = helloService.toInsert("insert into exam values(null,?,?,?,?)", "李四", 80, 51, 51, 51);
        return ""+result;
    }






}
