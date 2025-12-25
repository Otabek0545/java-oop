package task;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("v1 (birinchi avtomobil tezligi, km/soat): ");
        double v1 = scanner.nextDouble();

        System.out.print("v2 (ikkinchi avtomobil tezligi, km/soat): ");
        double v2 = scanner.nextDouble();

        System.out.print("s (boshlang'ich masofa, km): ");
        double s = scanner.nextDouble();

        System.out.print("t (vaqt, soat): ");
        double t = scanner.nextDouble();

        double sNew = s + (v1 + v2) * t;

        System.out.printf("t vaqt o‘tganidan keyingi ular orasidagi masofa: %.2f km\n", sNew);

    }
}
