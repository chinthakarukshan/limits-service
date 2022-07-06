package com.brushup.microservices.limitsservice.controller;

import com.brushup.microservices.limitsservice.configuration.Configuration;
import com.brushup.microservices.limitsservice.dto.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimits () {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
