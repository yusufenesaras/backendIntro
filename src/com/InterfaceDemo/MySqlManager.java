package com.InterfaceDemo;

public class MySqlManager implements CustomerSerivce{
    @Override
    public void add(Customer customer) {
        System.out.println("Mysql database eklendi : " + customer.getFirstName());
    }

    @Override
    public void update() {
        System.out.println("Mysql database güncellendi : ");
    }

    @Override
    public void delete() {
        System.out.println("Mysql database eklendi : ");
    }
}
