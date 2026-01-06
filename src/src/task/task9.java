package task;

import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        2ta manfiy bo'lmagan son a va b berilgan,ularni o'rta geometrigi aniqlansin!
            System.out.print("a = ");
            double a = scanner.nextDouble();
            System.out.print("b = ");
            double b = scanner.nextDouble();
            System.out.print("O'rta geometrigi: " + Math.pow(a * b, 0.5));
    }
}
