package com.example.demopasswordencryp.entity;

public class Customer {
    private final String idCustomer;
    private final String nameCustomer;

    public Customer(String idCustomer, String nameCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }
}
