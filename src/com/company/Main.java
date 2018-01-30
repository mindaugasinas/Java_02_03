package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite du skaicius");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int Suma = a + b;
        int Skirtumas = a - b;

        System.out.println("Skaiciu suma: " + Suma);
        System.out.println("Skaiciu skirtumas: " + Skirtumas);


        // write your code here
    }
}
