import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int soat = n / 3600;
        int qoldiq = n % 3600;
        int minut = qoldiq / 60;
        int sekund = qoldiq % 60;

        System.out.println(soat + " " + minut + " " + sekund);
    }
}
