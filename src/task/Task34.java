package task;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {

//        x kg shokolad a so'm turadi va y kg konfet b so'm turadi. 1kg shokolad 1kg konfetdan qancha
//        qimmat turishini aniqlovchi prog tuz.

        Scanner scanner = new Scanner(System.in);

        System.out.print("shokolad qiymatini (kg) kiriting: ");
        double x = scanner.nextDouble();
        System.out.print("shokolad narxini (so'm) kiriting: ");
        double a = scanner.nextDouble();
        System.out.print("konfet qiymatini (kg) kiriting: ");
        double y = scanner.nextDouble();
        System.out.print("konfet narxini (so'm) kiriting: ");
        double b = scanner.nextDouble();

        double chocolatePerKg = a / x;
        double candyPerKg = b / y;
        double difference = chocolatePerKg - candyPerKg;

        System.out.printf("1kg shokolad narxi %.2f so'm\n", chocolatePerKg);
        System.out.printf("1kg konfet narxi %.2f so'm\n", candyPerKg);
        System.out.printf("1kg shokolad 1kg konfetdan %.2f so'm qimmat", difference);
    }
}
