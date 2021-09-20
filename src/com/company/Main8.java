package com.company;

import javax.swing.*;

public class Main8 {
    public static void main(String[] args) {
        int testResult;
        String input;

        input = JOptionPane.showInputDialog("Wprowadź liczbowy wynik testu: ");
        testResult = Integer.parseInt(input);

        if (testResult < 60)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 1");
        else if (testResult < 70)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 2");
        else if (testResult < 80)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 3");
        else if (testResult < 90)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 4");
        else if (testResult <= 100)
            JOptionPane.showMessageDialog(null, "Twoja ocena to 5");
        else
            JOptionPane.showMessageDialog(null, "Podano nieprawidłowe dane!");
    }
}
