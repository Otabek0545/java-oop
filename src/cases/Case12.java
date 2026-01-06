package cases;

import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double v = scanner.nextDouble();
        double r = 0;
        double pi = 3.14;

        switch (n) {
            case 1:
                r = v;
                break;
            case 2:
                r = v / 2;
                break;
            case 3:
                r = v / (2 * pi);
                break;
            case 4:
                r = Math.sqrt(v / pi);
                break;
            default:
                System.out.println("Xato");
                return;
        }

        System.out.println("r=" + r);
        System.out.println("D=" + (2 * r));
        System.out.println("L=" + (2 * pi * r));
        System.out.println("S=" + (pi * r * r));
    }
}
