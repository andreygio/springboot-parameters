package com.epam.edp.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class HelloEdpController {

    @Value("${application.properties.from.configmap}")
    private String propertiesFromConfigMap;
    
    @Value("${application.secret.properties.from.secret}")
    private String propertiesFromSecret;

    @GetMapping(value = "/api/hello")
    public String hello() {
        return "Hello, EDP!";
    }

    @GetMapping(value = "/env")
    public Map<String, String> getEnvVariables() {
        return System.getenv();
    }
}
