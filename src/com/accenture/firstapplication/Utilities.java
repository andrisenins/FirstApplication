package com.accenture.firstapplication;

import java.util.Random;

public class Utilities {

    public static void printDoublesArray(double[][] doublesMultidimensionalArray) {
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
