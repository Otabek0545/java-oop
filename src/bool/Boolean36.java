package bool;

import java.util.Scanner;

public class Boolean36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result = (x1 == x2) || (y1 == y2);

        System.out.println(result);
    }
}
