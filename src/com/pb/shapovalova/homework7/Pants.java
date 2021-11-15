package com.pb.shapovalova.homework7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    private String name;

    public Pants (String color, int coast, Size size, String name) {
        super("черный", 300, Size.XS);
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println(color + coast + size + name);
    }

    @Override
    public void dressWomen() {
        System.out.println(color + coast + size + name);
    }
}
