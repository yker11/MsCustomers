package com.ms.customers.MsCustomers.service;

import com.ms.customers.MsCustomers.model.MsCustomers;
import com.ms.customers.MsCustomers.repository.MsCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceMsCustomersImpl implements ServiceMsCustomers {

    @Autowired
    MsCustomerRepository repository;

    @Override
    public Flux<MsCustomers> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<MsCustomers> save(MsCustomers msCustomers) {
        return repository.save(msCustomers);
    }

}
