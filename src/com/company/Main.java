package com.company;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId(1);
        product1.setProductName("H");
        product1.setUnistInStock(-5);
        ProductManager productManager = new ProductManager();

        productManager.isimGoster(product1);
        productManager.stokGoster(product1);


    }
}


