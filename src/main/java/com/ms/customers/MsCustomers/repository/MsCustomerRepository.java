package com.ms.customers.MsCustomers.repository;

import com.ms.customers.MsCustomers.model.MsCustomers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsCustomerRepository extends ReactiveMongoRepository<MsCustomers,String> {
}
