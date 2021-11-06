package com.pb.shapovalova.homework6;

import java.util.Objects;

public class Horse extends Animal{

    private int weight = 150;
    private int height = 120;

    public Horse(String food, String location, String name) {
        super(food, location, name);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " ест " + getFood());
    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " ржет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return weight == horse.weight && height == horse.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
