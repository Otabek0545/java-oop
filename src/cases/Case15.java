package cases;

import java.util.Scanner;

public class Case15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String son = "";
        String tur = "";

        switch (n) {
            case 6:
                son = "olti";
                break;
            case 7:
                son = "yetti";
                break;
            case 8:
                son = "sakkiz";
                break;
            case 9:
                son = "to‘qqiz";
                break;
            case 10:
                son = "o‘n";
                break;
            case 11:
                son = "valet";
                break;
            case 12:
                son = "dama";
                break;
            case 13:
                son = "qirol";
                break;
            case 14:
                son = "tuz";
                break;
            default:
                System.out.println("xato karta son!");
                return;
        }
        switch (m) {
            case 1:
                tur = "g‘isht";
                break;
            case 2:
                tur = "olma";
                break;
            case 3:
                tur = "chillak";
                break;
            case 4:
                tur = "qarg‘a";
                break;
            default:
                System.out.println("xato karta turi!");
                return;
        }
        System.out.println(son + " " + tur);

    }
}
