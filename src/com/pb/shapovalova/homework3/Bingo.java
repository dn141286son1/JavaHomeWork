package com.pb.shapovalova.homework3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        int count = 0;
        int x;
        int y;

        System.out.println("Игра Bingo - отгадайте число");

        Random rand = new Random();
        x = rand.nextInt(101);

        System.out.println("Введите целое число от 0 до 100. Для выхода введите число 111");

        Scanner num = new Scanner(System.in);

        do {
            count ++;
            y = num.nextInt();
            if (y>x) {
                System.out.println("Введенное число больше загаданного");
            }
            if (y<x) {
                System.out.println("Введенное число меньше загаданного");
            }
            if (y==111) {
                System.out.println("Выход из игры");
                break;
            }
            if (y==x) {
                System.out.println("Поздравляем! Вы отгадали число с " + count + " попытки");
                break;
            }

            } while (y!=x);
        System.out.println("Конец игры!");

        }


    }
