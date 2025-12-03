package bool;

import java.util.Scanner;

public class Boolean28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean result = (x > 0 && y > 0) || (x < 0 && y < 0);

        System.out.println(result);
    }
}
