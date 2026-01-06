package integer;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int soat = n / 3600;
        int sekund = n % 3600;

        System.out.println(soat + " " + sekund);
    }
}
