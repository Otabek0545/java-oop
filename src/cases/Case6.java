package cases;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println(a + " dm = " + a * 0.1 + " metr");
                break;
            case 2:
                System.out.println(a + " km = " + a * 1000 + " metr");
                break;
            case 3:
                System.out.println(a + " m = " + a + " metr");
                break;
            case 4:
                System.out.println(a + " mm = " + a * 0.001 + " metr");
                break;
            case 5:
                System.out.println(a + " sm = " + a * 0.01 + " metr");
                break;
            default:
                System.out.println("xato!");
        }
    }
}
