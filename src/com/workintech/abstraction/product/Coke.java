package com.workintech.abstraction.product;

public class Coke extends ProductForSale {
    private double size;

    public Coke(String type, double price, String description, double size) {
        super(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Its type: "+super.getType()+", Its price: "+
                super.getPrice()+", Its size: "+size+", Description: "+getDescription());
    }
}
