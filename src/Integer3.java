import java.util.Scanner;

public class Integer3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fayl hajmi (bayt): ");
        int b = scanner.nextInt();

        int kb = b / 1024;

        System.out.println("To‘liq kilobaytlar: " + kb);
    }
}
