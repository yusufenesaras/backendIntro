package com.InterfaceDemo;

public class Main {

    public static void main(String[] args){
        Customer customer = new Customer(1,"Yusuf Enes");
        CustomerSerivce customerService = new PostgreSqlManager();

        customerService.add(customer);
    }
}
