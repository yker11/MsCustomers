package com.ms.customers.MsCustomers.service;

import com.ms.customers.MsCustomers.model.MsCustomers;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceMsCustomers {

    Flux<MsCustomers> findAll();
    Mono<MsCustomers> save(MsCustomers MsCustomers);
}
