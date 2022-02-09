package com.ms.customers.MsCustomers.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "MsCustomersDB")
public class MsCustomers {
    @Id
    private String id;
    private String name;
    private String lastname;
    private int dni;
}
