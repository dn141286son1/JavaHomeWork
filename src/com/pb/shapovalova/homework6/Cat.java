package com.pb.shapovalova.homework6;

import java.util.Objects;

public class Cat extends Animal {

    private int weight = 3;
    private int height = 15;

    public Cat(String food, String location, String name) {
        super(food, location, name);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " ест " + getFood());
    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " говорит мяу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && height == cat.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
