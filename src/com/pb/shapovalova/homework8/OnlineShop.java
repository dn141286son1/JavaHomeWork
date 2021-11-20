package com.pb.shapovalova.homework8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Регистрация");
        System.out.println("Введите логин:");
        String loginUp = scan.nextLine();
        System.out.println("Введите пароль:");
        String passwordUp = scan.nextLine();
        System.out.println("Подтвердите пароль:");
        String confirmPassword = scan.nextLine();

        System.out.println("Вход в аккаунт");
        System.out.println("Введите логин:");
        String loginIn = scan.nextLine();
        System.out.println("Введите пароль:");
        String passwordIn = scan.nextLine();

        Auth person = new Auth();
    }
}
