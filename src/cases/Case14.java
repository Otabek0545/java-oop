package cases;

import java.util.Scanner;

public class Case14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double v = scanner.nextDouble();
        double a = 0;

        switch (n) {
            case 1:
                a = v;
                break;
            case 2:
                a = v * 6 / Math.sqrt(3);
                break;
            case 3:
                a = (v / 2) * 6 / Math.sqrt(3);
                break;
            case 4:
                a = Math.sqrt((4 * v) / Math.sqrt(3));
                break;
            default:
                System.out.println("Xato");
                return;
        }

        double r1 = a * Math.sqrt(3) / 6;
        double r2 = 2 * r1;
        double s = a * a * Math.sqrt(3) / 4;

        System.out.println("a=" + a);
        System.out.println("r1=" + r1);
        System.out.println("r2=" + r2);
        System.out.println("s=" + s);
    }
}
