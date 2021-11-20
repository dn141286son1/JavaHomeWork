package com.pb.shapovalova.homework7;

 class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("мужчина одевает штаны " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("женщина одевает штаны " + getInfo());
    }
}