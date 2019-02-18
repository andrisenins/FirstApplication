package com.accenture.firstapplication;

import java.util.Random;

public class Main {

    public static int number = 0;

    public static void main(String[] args) {
        System.out.println("Hello, World");
        int anotherNumber = 5;
        System.out.println("Sum of number and anotherNumber " + (number + anotherNumber));
        String greetings = "Hello, World!";
        System.out.println(greetings);


        int[] anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;
        int[] secondArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        System.out.println(secondArray[3]);

        for(int i = 0; i<secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
        for (int i : secondArray) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------");

        double[][] doublesMultidimensionalArray = createDoublesMultidimensionalArray(5);
        printDoublesArray(doublesMultidimensionalArray);

    }

    private static void printDoublesArray(double[][] doublesMultidimensionalArray) {
        for (double[] row : doublesMultidimensionalArray) {
            System.out.println();
            for (double singleElement : row) {
                System.out.print(singleElement + "; ");
            }

        }

    }

    public static double[][] createDoublesMultidimensionalArray(int size) {
        double[][] twoDimensionalArray = new double[size][size];
        Random random = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < size; j++) {
                twoDimensionalArray[i][j] = random.nextDouble() * 10;
            }
        }
        return twoDimensionalArray;
    }


}
