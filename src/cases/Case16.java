package cases;

import java.util.Scanner;

public class Case16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String onlik = "";
        String birlik = "";

        switch (n / 10) {
            case 2:
                onlik = "yigirma";
                break;
            case 3:
                onlik = "o‘ttiz";
                break;
            case 4:
                onlik = "qirq";
                break;
            case 5:
                onlik = "ellik";
                break;
            case 6:
                onlik = "oltmish";
                break;
            default:
                System.out.println("Yosh 20 dan 69 gacha bo‘lishi kerak!");
                return;
        }

        switch (n % 10) {
            case 0:
                birlik = "";
                break;
            case 1:
                birlik = " bir";
                break;
            case 2:
                birlik = " ikki";
                break;
            case 3:
                birlik = " uch";
                break;
            case 4:
                birlik = " to‘rt";
                break;
            case 5:
                birlik = " besh";
                break;
            case 6:
                birlik = " olti";
                break;
            case 7:
                birlik = " yetti";
                break;
            case 8:
                birlik = " sakkiz";
                break;
            case 9:
                birlik = " to‘qqiz";
                break;
            default:
                System.out.println("Noto‘g‘ri yosh!");
                return;
        }

        System.out.println(onlik + birlik + " yosh");
    }
}
