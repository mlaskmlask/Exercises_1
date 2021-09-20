package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        double salary;
        double yearsOnJob;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj roczne wynagrodzenie:");
        salary = scanner.nextDouble();
        System.out.println("Podaj liczbę przepracowanych lat:");
        yearsOnJob = scanner.nextDouble();

        if (salary > 5000) {
            if (yearsOnJob >= 2){
                System.out.println("Spełniasz warunki otrzymania pożyczki.");
            } else{
                System.out.println("Musisz być zatrudniony przynajmniej dwa lata aby uzyskać pożyczkę.");
            }
        } else {
            System.out.println("Musisz zarabiać przynajmniej 5 000 zł rocznie aby uzyskać pożyczkę");
        }
    }
}
