package com.pb.shapovalova.homework7;

 abstract class Clothes {
    protected final Size size;
    protected final float price;
    protected final String color;

    public Clothes(Size size, float price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getInfo() {
        return "размер " + size.name() + " " + size.getEuroSize() + " " + size.getDescription() +
                " цвет " + color + " цена " + price;
    }
}