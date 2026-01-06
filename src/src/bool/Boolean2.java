package bool;

import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        boolean result = (a % 2 != 0);
        System.out.println("Boolean: " + result);
    }
}
