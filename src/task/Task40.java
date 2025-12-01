package task;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A1 ni kiriting: ");
        double a1 = scanner.nextDouble();

        System.out.print("B1 ni kiriting: ");
        double b1 = scanner.nextDouble();

        System.out.print("C1 ni kiriting: ");
        double c1 = scanner.nextDouble();

        System.out.print("A2 ni kiriting: ");
        double a2 = scanner.nextDouble();

        System.out.print("B2 ni kiriting: ");
        double b2 = scanner.nextDouble();

        System.out.print("C2 ni kiriting: ");
        double c2 = scanner.nextDouble();

        double d = a1 * b2 - a2 * b1;

        if (Math.abs(d) > 1e-12) {
            double x = (c1 * b2 - c2 * b1) / d;
            double y = (a1 * c2 - a2 * c1) / d;
            System.out.printf("Yechim: x = %.6f, y = %.6f\n", x, y);
        } else {
            if (Math.abs(a1 * c2 - a2 * c1) < 1e-12 && Math.abs(b1 * c2 - b2 * c1) < 1e-12) {
                System.out.println("D = 0. Tenglamalar proporsional — cheksiz ko'p yechim mavjud.");
            } else {
                System.out.println("D = 0. Tenglamalar mos kelmaydi — yagona yechim yo'q.");
            }
        }
    }
}
