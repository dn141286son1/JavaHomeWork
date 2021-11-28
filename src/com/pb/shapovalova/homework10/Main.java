package com.pb.shapovalova.homework10;

public class Main {

    public static void main(String[] args) {

        NumBox<Float> floatNumBox = new NumBox<>(5);
        NumBox<Integer> integerNumBox = new NumBox<>(4);

        floatNumBox.set(0, 1.7f);
        floatNumBox.set(1, 1.2f);
        floatNumBox.set(2, 1.3f);
        floatNumBox.set(3, 1.4f);

        integerNumBox.set(0, 10);
        integerNumBox.set(1, 185);
        integerNumBox.set(2, 74);

        try{
            floatNumBox.add(1.5f);
        }catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        try{
            integerNumBox.add(13);
        }catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Среднее арифметическое: " + floatNumBox.average());
        System.out.println("Значение по индексу: " + floatNumBox.get(1));
        System.out.println("Максимальный элемент: " + floatNumBox.max());
        System.out.println("Сумма элементов: " + floatNumBox.sum());
        System.out.println("Текущее кол-во элементов: " + floatNumBox.length());

        System.out.println("Среднее арифметическое: " + integerNumBox.average());
        System.out.println("Значение по индексу: " + integerNumBox.get(2));
        System.out.println("Максимальный элемент: " + integerNumBox.max());
        System.out.println("Сумма элементов: " + integerNumBox.sum());
        System.out.println("Текущее кол-во элементов: " + integerNumBox.length());
    }
}
