package bool;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean isWhite = (x + y) % 2 != 0;

        System.out.println(isWhite);
    }
}
