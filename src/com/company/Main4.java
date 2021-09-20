package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik pierwszego testu:");
        int test1 = scanner.nextInt();
        System.out.println("Podaj wynik drugiego testu");
        int test2 = scanner.nextInt();
        System.out.println("Podaj wynik trzeciego testu");
        int test3 = scanner.nextInt();

        int average = (test1+test2+test3)/3;
        System.out.println("Średnia z testów wynosi " + average);
    }
}

