package com.pb.shapovalova.homework9;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {

    public static void createNumbersFile() {
        try (Writer writer1 = new FileWriter("numbers.txt")) {
            int x;
            int[][] array = new int[10][10];
            Random random = new Random();
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array.length; j++) {
                    x = random.nextInt(99) + 1;
                    array[i][j] = x;
                    writer1.write(array[i][j] + " ");
                }
                writer1.write('\n');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createOddNumbersFile() {
        try (Scanner scan = new Scanner(new File("numbers.txt"));
             Writer writer2 = new FileWriter("oddNumbers.txt")) {
            while (scan.hasNextLine()) {
                Scanner scanInt = new Scanner(scan.nextLine());
                while (scanInt.hasNextInt()) {
                    int y = scanInt.nextInt();
                    if (y % 2 == 0) {
                        y = 0;
                        writer2.write(y + " ");
                    } else
                    writer2.write(y + " ");
                }
                writer2.write('\n');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        createNumbersFile();
        createOddNumbersFile();
    }
}


