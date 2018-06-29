package com.example.trainingproject.controller;

import com.example.trainingproject.domain.Apple;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/monitor")
public class MonitorApiController {

    @Resource
    Apple driver;

    @RequestMapping("/alive")
    public String alive() {
        return driver.getName();
    }
}
