import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A (A ≠ 0) ni kiriting: ");
        double a = scanner.nextDouble();

        System.out.print("B ni kiriting: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("A = 0 bo‘lishi mumkin emas. Tenglama bir cheklangan yoki yechim yo‘q.");
        } else {
            double x = -b / a;
            System.out.printf("Tenglama yechimi: x = %.4f\n", x);
        }
    }
}
