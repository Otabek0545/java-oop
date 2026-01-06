package cases;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 kun mavjud!");
                break;
            case 2:
                System.out.println("28 kun mavjud!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 kun mavjud!");
                break;
            default:
                System.out.println("xato!");
        }
    }
}
