package com.ocr.yannick;

public class Product {
    private String name;
    private String description;
    private double price;


    /**
     * Display the full description of the product
     */
    public void look() {


    }

    /**
     *
     * @param bill the concerned the bill
     * @param quantity the quantity to add
     */
    public void buy(bill bill, Integer quantity) {


    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
