package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje ulubione miasto");
        String city = scanner.nextLine();

        int cityLength = city.replace(" ","").length();
        char firstLetter = city.charAt(0);
        String bold = city.toUpperCase();
        String small = city.toLowerCase();

        System.out.println("Liczba znaków w nazwie miasta wynosi: " + cityLength);
        System.out.println("Pierwsza litera Twojego ulubionego miasta to: " + firstLetter);
        System.out.println("Miasto drukowanymi: "+bold);
        System.out.println("Miasto małymi: "+ small);
    }
}
