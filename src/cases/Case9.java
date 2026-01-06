package cases;

import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int d = scanner.nextInt();

        String oy = "";
        int maxD = 0;

        switch (m) {
            case 1:
                oy = "Yanvar";
                maxD = 31;
                break;
            case 2:
                oy = "Fevral";
                maxD = 28;
                break;
            case 3:
                oy = "Mart";
                maxD = 31;
                break;
            case 4:
                oy = "Aprel";
                maxD = 30;
                break;
            case 5:
                oy = "May";
                maxD = 31;
                break;
            case 6:
                oy = "Iyun";
                maxD = 30;
                break;
            case 7:
                oy = "Iyul";
                maxD = 31;
                break;
            case 8:
                oy = "Avgust";
                maxD = 31;
                break;
            case 9:
                oy = "Sentabr";
                maxD = 30;
                break;
            case 10:
                oy = "Oktabr";
                maxD = 31;
                break;
            case 11:
                oy = "Noyabr";
                maxD = 30;
                break;
            case 12:
                oy = "Dekabr";
                maxD = 31;
                break;
            default:
                System.out.println("Noto‘g‘ri oy!");
                return;
        }
        if (d < 1 || d > maxD) {
            System.out.println("Noto‘g‘ri sana!");
        } else {
            System.out.println((d + 1) + " " + oy);
        }
    }
}
