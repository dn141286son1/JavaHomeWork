package com.pb.shapovalova.homework7;

public class Skirt extends Clothes implements WomenClothes {

    private String name;

    public Skirt (String color, int coast, Size size, String name) {
        super("серый", 150, Size.S);
        this.name = name;
    }

    @Override
    public void dressWomen() {
        System.out.println(color + coast + size + name);
    }
}
