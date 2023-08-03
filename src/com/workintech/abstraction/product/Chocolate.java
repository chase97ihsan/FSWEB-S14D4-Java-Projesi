package com.workintech.abstraction.product;

public class Chocolate extends ProductForSale{

    private String type;

    public Chocolate(String type, double price, String description, String type1) {
        super(type, price, description);
        this.type = type1;
    }

    @Override
    public void showDetails() {
        StringBuilder builder=new StringBuilder();
        builder.append("Its chocolate type:"+type+"\n");
        System.out.println(super.toString()+builder.toString());


    }
}
