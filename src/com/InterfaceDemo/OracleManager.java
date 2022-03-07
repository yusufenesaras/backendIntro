package com.InterfaceDemo;

public class OracleManager implements CustomerSerivce{
    @Override
    public void add(Customer customer) {
        System.out.println("Oracle eklendi : " + customer.getFirstName());
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
