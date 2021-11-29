package com.pb.shapovalova.homework10;

public class NumBox <T extends Number> {

    private final T[] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(T num) throws Exception {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) {
                numbers[i] = num;
                break;
            }else if (i == numbers.length - 1){
                throw new Exception("Массив заполнен!");}
        }
    }

    public T get(int index){
        return numbers[index];
    }

    public int length(){
        int currentLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null){
                currentLength++;
            }
        }
        return currentLength;
    }

    public double average(){
        double sum = 0;
        for (T i : numbers) {
            if (i != null) {
                sum += i.doubleValue();
            }
        }
        double average = sum / length();
        return average;
    }

    public double sum(){
        double sum = 0;
        for (T i : numbers) {
            if (i != null) {
                sum += i.doubleValue();
            }
        }
        return sum;
    }

    public double max(){
        double max = 0.0;
        for (T i : numbers) {
            if (i != null){
                if (i.doubleValue() > max) {
                    max = i.doubleValue();
                }
            }
        }
        return max;
    }

    public void set(int index, T number) {
        this.numbers[index] = number;
    }
}
