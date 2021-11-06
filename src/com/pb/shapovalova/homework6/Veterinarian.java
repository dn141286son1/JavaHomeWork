package com.pb.shapovalova.homework6;

public class Veterinarian {

    public void treatAnimal(Animal... animals){
        for (Animal animal: animals) {
            System.out.println(animal.getName() + " пришел на прием с "
                    + animal.getLocation() + " наевшись " + animal.getFood());
        }
    }
}
