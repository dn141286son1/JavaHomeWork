package com.pb.shapovalova.homework3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int [] array = new int [10];
        int i;
        int j;
        int sum = 0;
        int count = 0;
        int temp;

        System.out.println("Введите массив целых чисел");
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < array.length; i++){
            array [i] = scan.nextInt();
        }
        System.out.println("Введенный массив " + Arrays.toString(array));

        for (i = 0; i < array.length; i++){
            sum += array [i];
        }
        System.out.println("Сумма чисел массива: " + sum);

        for (i = 0; i < array.length; i++){
            if (array[i]>0){
                count++;
            }
        }
        System.out.println("Количество положительных элементов: " + count);

        for (i = array.length-1; i>0; i--) {
            for (j=0; j<i; j++){
               if (array[j]>array[j+1]){
                   temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }
            }
        }
        System.out.println("Отсортированный массив " + Arrays.toString(array));
    }
}
