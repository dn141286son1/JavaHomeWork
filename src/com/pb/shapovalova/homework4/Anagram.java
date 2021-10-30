package com.pb.shapovalova.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = scan.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = scan.nextLine();
        String result = isAnagram (str1, str2);
        System.out.println(result);
    }

    private static String isAnagram (String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")
                || !str1.matches("[A-Za-z,. ]+") || !str2.matches("[A-Za-z,. ]+")) {
            return "Строки не являются анаграммами";
        }
        String answer = "";

        String st = str1.replaceAll("[,.:; ]+", "");
        String nd = str2.replaceAll("[,.:; ]+", "");

        if (st.equals("") || nd.equals("")) {
            return "Строки не являются анаграммами";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "Строки  являются анаграммами";
        } else {
            answer = "Строки не являются анаграммами";
        }
        return answer;
    }

}
