package com.InterfaceDemo;

public class PostgreSqlManager implements CustomerSerivce{
    @Override
    public void add(Customer customer) {
        System.out.println("Postgresql eklendi " + customer.getFirstName());
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
