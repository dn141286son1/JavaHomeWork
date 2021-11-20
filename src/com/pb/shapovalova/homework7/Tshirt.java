package com.pb.shapovalova.homework7;

 class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("мужчина одевает футболку " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("женщина одевает футболку " + getInfo());
    }
}