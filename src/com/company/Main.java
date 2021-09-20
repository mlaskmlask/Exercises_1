package com.company;

public class Main {

    public static void main(String[] args) {

        int totalSale = 4600000;
        double regionSalePercentage = 0.46;
        double regionSale;

        regionSale = totalSale * regionSalePercentage;

        System.out.printf("Region generuje sprzedaż w wysokości %,.2f złotych.", regionSale);
    }
}
