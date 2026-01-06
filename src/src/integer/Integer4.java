package integer;

import java.util.Scanner;

public class Integer4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A ni kiriting: ");
        int a = scanner.nextInt();

        System.out.print("B ni kiriting (A > B): ");
        int b = scanner.nextInt();

        int n = a / b;

        System.out.println("B kesma A kesmada " + n + " marta joylashadi.");
    }
}
