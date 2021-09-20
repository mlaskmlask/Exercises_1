package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        double number1;
        double number2;
        double divResult;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę: ");
        number1 = scanner.nextInt();

        System.out.println("Wprowadź drugą liczbę: ");
        number2 = scanner.nextInt();

        if (number2 == 0) {
            System.out.println("Dzielenie przez zero nie jest możliwe");
        } else {
            divResult = number1 / number2;
            System.out.println("Wynik dzielenia wynosi: " + divResult);
        }
    }
}
