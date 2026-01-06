package cases;

import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println(a + " kg = " + a + " kg");
                break;
            case 2:
                System.out.println(a + " mg = " + a * 0.000001 + " kg");
                break;
            case 3:
                System.out.println(a + " g = " + a * 0.001 + " kg");
                break;
            case 4:
                System.out.println(a + " tonna = " + a * 1000 + " kg");
                break;
            case 5:
                System.out.println(a + " st = " + a * 100 + " kg");
                break;
            default:
                System.out.println("xato!");
        }
    }
}
