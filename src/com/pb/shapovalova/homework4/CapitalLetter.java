package com.pb.shapovalova.homework4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {

        System.out.println("Введите строку");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(toUpperCase(str));
    }

    private static String toUpperCase(String str) {
        StringBuilder strBl = new StringBuilder(str);

        if (Character.isAlphabetic(str.codePointAt(0)))
            strBl.setCharAt(0, Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++)
            if (Character.isAlphabetic(str.charAt(i)) && Character.isSpaceChar(str.charAt(i - 1)))
                strBl.setCharAt(i, Character.toUpperCase(str.charAt(i)));

        return strBl.toString();
    }
}