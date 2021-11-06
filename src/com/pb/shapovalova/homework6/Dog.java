package com.pb.shapovalova.homework6;

import java.util.Objects;

public class Dog extends Animal{

    private int weight = 15;
    private int height = 50;

    public Dog(String food, String location, String name) {
        super(food, location, name);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " грызет " + getFood());
    }

    @Override
    public void makeNoise(){
        System.out.println(getName() + " гавкает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight && height == dog.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
