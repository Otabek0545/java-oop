package cases;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double v = scanner.nextDouble();
        double a = 0, s, h, c;

        switch (n) {
            case 1:
                a = v;
                break;
            case 2:
                a = v / Math.sqrt(2);
                break;
            case 3:
                a = 2 * v / Math.sqrt(2);
                break;
            case 4:
                a = Math.sqrt(v) * Math.sqrt(2);
                break;
            default:
                System.out.println("xato!");
                return;
        }
        c = a * Math.sqrt(2);
        h = c / 2;
        s = (c * h) / 2;

        System.out.println("a=" + a);
        System.out.println("c=" + c);
        System.out.println("h=" + h);
        System.out.println("S=" + s);
    }
}
