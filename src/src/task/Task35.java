package task;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qayiq tezligi V (km/soat): ");
        double v = scanner.nextDouble();

        System.out.print("Daryo oqimi tezligi u (km/soat): ");
        double u = scanner.nextDouble();

        System.out.print("Oqim bo'yicha vaqt t1 (soat): ");
        double t1 = scanner.nextDouble();

        System.out.print("Oqimga qarshi vaqt t2 (soat): ");
        double t2 = scanner.nextDouble();

        double s1 = (v + u) * t1;
        double s2 = (v - u) * t2;
        double s = s1 + s2;

        System.out.printf("Oqim bo'yicha masofa s1 = %.2f km\n", s1);
        System.out.printf("Oqimga qarshi masofa s2 = %.2f km\n", s2);
        System.out.printf("Umumiy bosib o'tilgan masofa s = %.2f km\n", s);

    }
}
