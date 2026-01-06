package cases;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        switch (n) {
            case 1:
                System.out.println("a + b = " + (a + b));
                break;
            case 2:
                System.out.println("a - b = " + (a - b));
                break;
            case 3:
                System.out.println("a / b = " + (a / b));
                break;
            case 4:
                System.out.println("a * b = " + (a * b));
                break;
            default:
                System.out.println("xato!");
        }
    }
}
