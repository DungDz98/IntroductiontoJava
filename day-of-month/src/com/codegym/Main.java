package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();

        String dayIsMonth;
        switch (month) {
            case 2:
                dayIsMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30";
                break;
            default:
                dayIsMonth = "";
        }

        if (!dayIsMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, dayIsMonth);
        } else {
            System.out.print("Invalid input!");
        }
    }
}
