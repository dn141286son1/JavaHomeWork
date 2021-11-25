package com.pb.shapovalova.homework8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {

        Auth person = new Auth();
        Scanner scan = new Scanner(System.in);

        System.out.println("Регистрация");
        System.out.println("Введите логин:");
        String loginUp = scan.nextLine();
        System.out.println("Введите пароль:");
        String passwordUp = scan.nextLine();
        System.out.println("Подтвердите пароль:");
        String confirmPassword = scan.nextLine();

        try {
            person.SignUp(loginUp, passwordUp, confirmPassword);
        }catch (WrongLoginException ex) {
            System.out.println("Ошибка логина:" + ex.getMessage());
        }catch (WrongPasswordException ex1){
            System.out.println("Ошибка пароля:" + ex1.getMessage());
        }

        System.out.println("Вход в аккаунт");
        System.out.println("Введите логин:");
        String loginIn = scan.nextLine();
        System.out.println("Введите пароль:");
        String passwordIn = scan.nextLine();

        try {
            person.SignIn(loginIn, passwordIn);
        }catch (WrongLoginException ex2) {
            System.out.println("Ошибка:" + ex2.getMessage());
        }
    }
}
