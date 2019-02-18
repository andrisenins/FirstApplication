package com.accenture.firstapplication;

import java.util.Random;

import static com.accenture.firstapplication.Utilities.createDoublesMultidimensionalArray;
import static com.accenture.firstapplication.Utilities.printDoublesArray;

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




}
