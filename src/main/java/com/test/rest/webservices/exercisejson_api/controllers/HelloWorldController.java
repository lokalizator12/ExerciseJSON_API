package com.test.rest.webservices.exercisejson_api.controllers;


import com.test.rest.webservices.exercisejson_api.services.MachineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
public class HelloWorldController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final MachineService machineService = new MachineService(restTemplate);

    @GetMapping("/hello-world")
    public String getHello() {
        machineService.getDataAndService();
        return "hello world";
    }

}
