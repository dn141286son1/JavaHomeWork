package com.pb.shapovalova.homework7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Atelier {

    public Atelier() throws Exception {
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
                new Tshirt(Size.S, 58, "желтый"),
                new Pants(Size.M, 105.50f, "черный"),
                new Skirt(Size.M, 78.45f, "зеленый"),
                new Tie(Size.XXS, 15.20f, "красный")
        };

        dressMan(clothes);

        System.out.println();

        dressWomen(clothes);
    }

    //-------------------------------- methods ---------------------------

    private static void dressMan(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}