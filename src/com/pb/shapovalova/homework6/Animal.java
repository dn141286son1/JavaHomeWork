package com.pb.shapovalova.homework6;

public class Animal {

    private String food;
    private String location;
    private String name;

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " спит");
    }

    public void eat(){
    }

    public void makeNoise(){
    }
}
