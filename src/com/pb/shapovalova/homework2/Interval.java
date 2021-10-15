package com.pb.shapovalova.homework2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        x = scan.nextInt();
        if (x >= 0 && x <= 100) {
            if (x <= 14) {
                System.out.println("Введенное число находится в промежутке [0 - 14]");
            }
            if (x >= 51) {
                System.out.println("Введенное число находится в промежутке [51 - 100]");
            }
            if (x >= 15 && x <= 35) {
                System.out.println("Введенное число находится в промежутке [15 - 35]");
            } if (x>=36 && x<=50) {
                System.out.println("Введенное число находится в промежутке [36 - 50]");
            }

        }
        else {System.out.println("Введенное число не найдено в интервале [0 - 100]");

        }
    }
}