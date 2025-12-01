import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int minut = n / 60;
        int sekund = n % 60;

        System.out.println(minut + " " + sekund);
    }
}
