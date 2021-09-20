package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double stateTax = 0.04;
        double localTax = 0.02;

        System.out.println("Podaj wartość zakupionego towaru");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        double stateTaxValue = userInput * stateTax;
        double localTaxValue = userInput * localTax;

        double afterTax = userInput + stateTaxValue + localTaxValue;

        System.out.printf("Koszt towaru po opodatkowaniu to %,.2f złotych.", afterTax);
    }

}
