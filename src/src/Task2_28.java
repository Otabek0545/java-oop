import java.util.Scanner;

public class Task2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Aylana radiusini kiritng: ");
        int radius = input.nextInt();

        System.out.printf("Diametri: %d\n", 2 * radius);
        System.out.printf("Uzunligi: %f\n", 2 * 3.14159 * radius);
        System.out.printf("Yuzi: %f\n", 3.14159 * radius * radius);
    }
}
