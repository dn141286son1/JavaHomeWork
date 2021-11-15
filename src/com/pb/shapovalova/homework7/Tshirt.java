package com.pb.shapovalova.homework7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    private String name;

    public Tshirt (String color, int coast, Size size, String name) {
        super("белый", 200, Size.XXS);
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
