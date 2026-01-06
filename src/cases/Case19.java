package cases;

import java.util.Scanner;

public class Case19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yilni kiriting: ");
        int year = scanner.nextInt();

        int difference = year - 1984;

        int rang = (difference % 10) / 2;
        int hayvon = difference % 12;

        if (rang < 0) rang += 5;
        if (hayvon < 0) hayvon += 12;

        String rangNomi = "";
        String hayvonNomi = "";

        switch (rang) {
            case 0:
                rangNomi = "Yashil";
                break;
            case 1:
                rangNomi = "Qizil";
                break;
            case 2:
                rangNomi = "Sariq";
                break;
            case 3:
                rangNomi = "Oq";
                break;
            case 4:
                rangNomi = "Qora";
                break;
        }
        switch (hayvon) {
            case 0:
                hayvonNomi = "Sichqon";
                break;
            case 1:
                hayvonNomi = "Sigir";
                break;
            case 2:
                hayvonNomi = "Yo'lbars";
                break;
            case 3:
                hayvonNomi = "Quyon";
                break;
            case 4:
                hayvonNomi = "Ajdar";
                break;
            case 5:
                hayvonNomi = "Ilon";
                break;
            case 6:
                hayvonNomi = "Ot";
                break;
            case 7:
                hayvonNomi = "Qo'y";
                break;
            case 8:
                hayvonNomi = "Maymun";
                break;
            case 9:
                hayvonNomi = "Tovuq";
                break;
            case 10:
                hayvonNomi = "It";
                break;
            case 11:
                hayvonNomi = "To'ng'iz";
                break;
        }

        System.out.println(rangNomi + " " + hayvonNomi + " yili");

    }
}
