package com.workintech.abstraction.product;

public class Bread extends ProductForSale{

    private String type;

    public Bread(String type, double price, String description, String type1) {
        super(type, price, description);
        this.type = type1;
    }

    @Override
    public void showDetails() {
        System.out.println("Its type: "+super.getType()+", Its price: "+
                super.getPrice()+", Its bread type: "+type+", Description: "+getDescription());
    }
}
