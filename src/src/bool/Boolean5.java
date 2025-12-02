package bool;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean result = (a >= 0 || b < -2);
        System.out.println("Boolean: " + result);
    }
}
