package cases;

import java.util.Scanner;

public class Case18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Son 100 dan 999 gacha bo‘lishi kerak!");
            return;
        }

        String yuzlik = "";
        String onlik = "";
        String birlik = "";

        switch (n / 100) {
            case 1:
                yuzlik = "bir yuz";
                break;
            case 2:
                yuzlik = "ikki yuz";
                break;
            case 3:
                yuzlik = "uch yuz";
                break;
            case 4:
                yuzlik = "to'rt yuz";
                break;
            case 5:
                yuzlik = "besh yuz";
                break;
            case 6:
                yuzlik = "olti yuz";
                break;
            case 7:
                yuzlik = "yetti yuz";
                break;
            case 8:
                yuzlik = "sakkiz yuz";
                break;
            case 9:
                yuzlik = "to'qqiz yuz";
                break;
            default:
                System.out.println("xato yuzlik!");
        }
        switch ((n / 10) % 10) {
            case 0:
                onlik = "";
                break;
            case 1:
                onlik = " o‘n";
                break;
            case 2:
                onlik = " yigirma";
                break;
            case 3:
                onlik = " o‘ttiz";
                break;
            case 4:
                onlik = " qirq";
                break;
            case 5:
                onlik = " ellik";
                break;
            case 6:
                onlik = " oltmish";
                break;
            case 7:
                onlik = " yetmish";
                break;
            case 8:
                onlik = " sakson";
                break;
            case 9:
                onlik = " to‘qson";
                break;
            default:
                System.out.println("Xato o‘nlik!");
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
                System.out.println("Xato birlik!");
                return;
        }

        System.out.println(yuzlik + onlik + birlik);
    }
}
