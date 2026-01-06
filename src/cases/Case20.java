package cases;

import java.util.Scanner;

public class Case20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int m = scanner.nextInt();

        String burj = "";

        switch (m) {
            case 1:
                if (d >= 20)
                    burj = "qovg'a";
                else burj = "echki";
                break;
            case 2:
                if (d <= 18)
                    burj = "qovg'a";
                else burj = "baliq";
                break;
            case 3:
                if (d <= 20)
                    burj = "baliq";
                else burj = "qo'y";
                break;
            case 4:
                if (d <= 19)
                    burj = "qo'y";
                else burj = "buzoq";
                break;
            case 5:
                if (d <= 20)
                    burj = "buzoq";
                else burj = "egizaklar";
                break;
            case 6:
                if (d <= 21)
                    burj = "egizaklar";
                else burj = "qisqichbaqa";
                break;
            case 7:
                if (d <= 22)
                    burj = "qisqichbaqa";
                else burj = "arslon";
                break;
            case 8:
                if (d <= 22)
                    burj = "arslon";
                else burj = "parizod";
                break;
            case 9:
                if (d <= 22)
                    burj = "parizod";
                else burj = "tarozi";
                break;
            case 10:
                if (d <= 22)
                    burj = "tarozi";
                else burj = "chayon";
                break;
            case 11:
                if (d <= 22)
                    burj = "chayon";
                else burj = "o'qotar";
                break;
            case 12:
                if (d <= 21)
                    burj = "o'qotar";
                else burj = "echki";
                break;
            default:
                System.out.println("Noto'g'ri oy kiritildi");
                return;
        }
        System.out.println(d + "." + m + " " + burj);
    }
}
