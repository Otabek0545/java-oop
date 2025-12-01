import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("v1 (birinchi avtomobil tezligi, km/soat): ");
        double v1 = scanner.nextDouble();

        System.out.print("v2 (ikkinchi avtomobil tezligi, km/soat): ");
        double v2 = scanner.nextDouble();

        System.out.print("s (boshlang'ich masofa, km): ");
        double s = scanner.nextDouble();

        System.out.print("T (vaqt, soat): ");
        double t = scanner.nextDouble();

        double sNew = s - (v1 + v2) * t;
        if (sNew < 0) {
            System.out.println("Natija manfiy: ular T vaqt ichida uchrashadi. Haqiqiy masofa = 0 km (uchrashgan).");
        } else {
            System.out.printf("T vaqt o‘tganidan keyingi ular orasidagi masofa: %.2f km\n", sNew);
        }

    }
}
