package com.pb.shapovalova.homework7;

 class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("женщина одевает юбку " + getInfo());
    }
}