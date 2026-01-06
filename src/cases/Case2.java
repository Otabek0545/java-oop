package cases;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        switch (k) {
            case 1:
                System.out.println("Yomon");
                break;
            case 2:
                System.out.println("Qoniqarsiz");
                break;
            case 3:
                System.out.println("Qoniqarli");
                break;
            case 4:
                System.out.println("Yaxshi");
                break;
            case 5:
                System.out.println("A'lo");
                break;
            default:
                System.out.println("Xato!");
        }
    }
}
