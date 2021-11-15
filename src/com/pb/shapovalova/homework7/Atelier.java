package com.pb.shapovalova.homework7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Atelier {

    public Atelier() throws Exception {
    }

    public static void main(String[] args) {

    }
    public static void dressMan (Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof Pants || clothe instanceof Tshirt || clothe instanceof Tie) {
                ((ManClothes) clothe).dressMan();
            }
}
    }

    public static void dressWomen (Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof Pants || clothe instanceof Tshirt || clothe instanceof Skirt) {
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }

    Tshirt tshirt = new Tshirt("белый", 200, Size.XXS, "рубашка");
    Pants pants = new Pants("черный", 300, Size.XS, "штаны");
    Tie tie = new Tie("голубой", 50, Size.M, "галстук");
    Skirt skirt = new Skirt("серый", 150, Size.S, "юбка");

    Clothes[] clothes = new Clothes[]{tshirt, pants, tie, skirt};

    Class clazz = Class.forName("homework7.Atelier");

    Constructor constr = clazz.getConstructor(String.class);
    Object atel = constr.newInstance("Одежка");

    Method dressWomen = clazz.getMethod("dressWomen", Clothes.class);

        for (Clothes clothe: clothes) {
        dressWomen.invoke(atel, clothe);
    }

    Method dressMan = clazz.getMethod("dressMan", Clothes.class);

        for (Clothes clothe: clothes) {
        dressMan.invoke(atel, clothe);
    }
}
