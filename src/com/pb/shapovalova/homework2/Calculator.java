package com.pb.shapovalova.homework2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите операнд1");
        operand1 = scan.nextInt();
        System.out.println("Введите операнд2");
        operand2 = scan.nextInt();
        System.out.println("Введите знак необходимой операции");
        sign = scan.next();

        switch (sign) {
            case "+" :
                System.out.println("Результат = " + (operand1 + operand2));
                break;
                case  "-" :
                System.out.println("Результат = " + (operand1 - operand2));
                break;
                case  "*" :
                System.out.println("Результат = " + (operand1 * operand2));
                break;
                case  "/" :
        if (operand2 != 0) {
               System.out.println("Результат = " + (operand1 / operand2));}
            else { System.out.println("На ноль делить нельзя!");}
               break;
        }
    }
}
