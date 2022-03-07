package com.company;

public class Product {

    private int id;
    private String productName;
    private int unistInStock;


    public Product(int id, String productName, int unistInStock){
        this.id = id;
        this.productName = productName;
        this.unistInStock = unistInStock;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {

        if(productName.length() <3 ){
            System.out.println("Geçerli bir ürün giriniz!");
            return null;
        }

        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnistInStock() {

        if(unistInStock < 0){
            System.out.println("Stok adedi 0 dan küçük olamaz !");
            return 0;
        }

        return unistInStock;
    }

    public void setUnistInStock(int unistInStock) {
        this.unistInStock = unistInStock;
    }
}
