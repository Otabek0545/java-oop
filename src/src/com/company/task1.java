package com.company;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

	//task1: kvadrat tomoni a berilgan. uning perimetri P=4a aniqlansin!

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadrat tomonini kiriitng: ");
        double a = scanner.nextDouble();
        double p = 4*a;
        System.out.println("P = "+p);

    }
}
