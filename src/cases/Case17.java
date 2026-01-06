package cases;

import java.util.Scanner;

public class Case17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String onlik = "";
        String birlik = "";

        switch (n / 10) {
            case 1:
                onlik = "o'n";
                break;
            case 2:
                onlik = "yigirma";
                break;
            case 3:
                onlik = "o'ttiz";
                break;
            case 4:
                onlik = "qirq";
                break;
            default:
                System.out.println("yosh 10 dan 40 gacha bo'lishi kerak!");
                return;
        }
        switch (n % 10) {
            case 0:
                birlik = "ta ";
                break;
            case 1:
                birlik = " bitta ";
                break;
            case 2:
                birlik = " ikkita ";
                break;
            case 3:
                birlik = " uchta ";
            case 4:
                birlik = " to'rtta ";
            case 5:
                birlik = " beshta ";
                break;
            case 6:
                birlik = " oltita ";
                break;
            case 7:
                birlik = " yettita ";
                break;
            case 8:
                birlik = " sakkizta ";
                break;
            case 9:
                birlik = " to'qqizta ";
                break;
            default:
                System.out.println("Noto'g'ri yosh!");
                return;
        }
        System.out.println(onlik + birlik + "masala");
    }
}
