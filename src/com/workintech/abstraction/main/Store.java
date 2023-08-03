package com.workintech.abstraction.main;

import com.workintech.abstraction.product.Bread;
import com.workintech.abstraction.product.Chocolate;
import com.workintech.abstraction.product.Coke;
import com.workintech.abstraction.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale coke1 = new Coke("Drink", 14, "Please drink cold!", 330);
        ProductForSale bread1 = new Bread("Food", 7, "Its a handmade bread:)", "Handmade");
        ProductForSale chocolate1 = new Chocolate("Food", 6, "Its a chocolate with peanut.", "With Peanut");

        listProducts(coke1, chocolate1, bread1);


    }


    public static void listProducts(ProductForSale... products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }

    }
}