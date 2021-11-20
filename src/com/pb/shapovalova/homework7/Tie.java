package com.pb.shapovalova.homework7;

 class Tie extends Clothes implements ManClothes {
    public Tie(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("мужчина одевает галстук " + getInfo());
    }
}