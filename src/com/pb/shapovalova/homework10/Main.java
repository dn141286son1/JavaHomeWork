package com.pb.shapovalova.homework10;

public class Main {

    public static void main(String[] args) {

        NumBox<Float> floatNumBox = new NumBox<>(10);
        NumBox<Integer> integerNumBox = new NumBox<>(6);

        floatNumBox.set(0, 10.1f);
        floatNumBox.set(1, 20.2f);
        floatNumBox.set(2, 30.3f);
        floatNumBox.set(3, 40.4f);

        integerNumBox.set(0, 50);
        integerNumBox.set(1, 100);
        integerNumBox.set(2, 150);

        try{
            floatNumBox.add(50.5f);
            floatNumBox.add(500.6f);
            floatNumBox.add(800.7f);
            System.out.println("Среднее арифметическое: " + floatNumBox.average());
            System.out.println("Значение по индексу: " + floatNumBox.get(1));
            System.out.println("Максимальный элемент: " + floatNumBox.max());
            System.out.println("Сумма элементов: " + floatNumBox.sum());
            System.out.println("Текущее кол-во элементов: " + floatNumBox.length());
        }catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        try{
            integerNumBox.add(200);
            integerNumBox.add(3000);
            integerNumBox.add(10000);
            System.out.println("Среднее арифметическое: " + integerNumBox.average());
            System.out.println("Значение по индексу: " + integerNumBox.get(2));
            System.out.println("Максимальный элемент: " + integerNumBox.max());
            System.out.println("Сумма элементов: " + integerNumBox.sum());
            System.out.println("Текущее кол-во элементов: " + integerNumBox.length());
        }catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
