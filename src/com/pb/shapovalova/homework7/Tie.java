package com.pb.shapovalova.homework7;

public class Tie extends Clothes implements ManClothes {

    private String name;

    public Tie (String color, int coast, Size size, String name) {
        super("голубой", 50, Size.M);
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println(color + coast + size + name);
    }
}
