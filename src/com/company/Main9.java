package com.company;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz nazwę pory roku:");
        input = scanner.nextLine();

        switch (input){
            case "wiosna":
                System.out.println("Po hiszpańsku: la primavera");
                break;
            case "lato":
                System.out.println("Po hiszpańsku: el verano");
                break;
            case "jesień":
                System.out.println("Po hiszpańsku: el otono");
                break;
            case "zima":
                System.out.println("Po hiszpańsku: el invierno");
                break;
            default:
                System.out.println("Wpisz: wiosna, lato, jesień lub zima. ");
        }
    }
}
