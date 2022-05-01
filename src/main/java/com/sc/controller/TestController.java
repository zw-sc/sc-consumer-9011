package com.sc.controller;

import com.sc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class TestController {

    @Autowired
    private TestService testService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("test/{id}")
    public Integer test(@PathVariable Long id) {
        System.out.println("访问位置：" + port);
        return testService.findDefaultResumeState(id);
    }
}
