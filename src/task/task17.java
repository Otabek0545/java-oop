package task;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        sonlar o'qida A,B,C nuqtalar berilgan! AC va BC kesmalar uzunligi va kesmalar uzunligining
//        yig'indisini topuvchi programma tuzilsin!
        System.out.print("A = ");
        double A = scanner.nextDouble();
        System.out.print("B = ");
        double B = scanner.nextDouble();
        System.out.print("C = ");
        double C = scanner.nextDouble();
        double m = Math.abs(A - C);
        double n = Math.abs(B - C);
        double l = Math.abs(m + n);
        System.out.println("|AC| = " + m);
        System.out.println("|BC| = " + n);
        System.out.println("|AC| + |BC| = " + l);
    }
}
