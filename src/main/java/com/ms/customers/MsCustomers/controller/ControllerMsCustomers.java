package com.ms.customers.MsCustomers.controller;

import com.ms.customers.MsCustomers.model.MsCustomers;
import com.ms.customers.MsCustomers.service.ServiceMsCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ControllerMsCustomers {

    @Autowired
    ServiceMsCustomers service;

    @GetMapping("/getMsCustomers")
    public Flux<MsCustomers> getCustomers()
    {
        return service.findAll();
    }

    @PostMapping("/postMsCustomers")
    Mono<MsCustomers> postMsCustomers(@RequestBody MsCustomers MsCustomer) {
        return service.save(MsCustomer);
    }
}
