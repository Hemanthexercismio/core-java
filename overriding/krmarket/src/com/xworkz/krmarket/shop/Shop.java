package com.xworkz.krmarket.shop;

public interface Shop {
    public void vegetablesShop();
    default void GroceryShop(){
        System.out.println("executing GroceryShop in Shop");
    }
}
