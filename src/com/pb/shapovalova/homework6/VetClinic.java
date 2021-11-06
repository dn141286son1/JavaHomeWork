package com.pb.shapovalova.homework6;

import java.lang.reflect.Constructor;

public class VetClinic {

    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("кости","парк", "Собака");
        Cat cat = new Cat("рыбу","дом", "Кот");
        Horse horse = new Horse("траву","поле", "Лошадь");

        dog.sleep();
        dog.eat();
        dog.makeNoise();

        cat.sleep();
        cat.eat();
        cat.makeNoise();

        horse.sleep();
        horse.eat();
        horse.makeNoise();

        //Veterinarian vt = new Veterinarian();
        //Class clazz = vt.getClass();

        Class vtsClazz = Class.forName("com.pb.shapovalova.homework6.Veterinarian");

        Constructor cons = vtsClazz.getConstructor(new Class[] {String.class});
        Object obj = cons.newInstance();
        if (obj instanceof Animal) {
            ((Veterinarian) obj).treatAnimal();
        }

    //    Animal[] animals = {dog, cat, horse};

      //  for (int i = 0; i < animals.length; i++){
      //      vts.treatAnimal();
        }
    }
}
