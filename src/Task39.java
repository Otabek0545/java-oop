import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A (A ≠ 0) ni kiriting: ");
        double a = scanner.nextDouble();

        System.out.print("B ni kiriting: ");
        double b = scanner.nextDouble();

        System.out.print("C ni kiriting: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("A = 0 bo‘lishi mumkin emas (kvadrat tenglama emas).");
        } else {
            double d = b * b - 4 * a * c;
            System.out.printf("Diskriminant D = %.4f\n", d);

            if (d > 0) {
                double sqrtD = Math.sqrt(d);
                double x1 = (-b + sqrtD) / (2 * a);
                double x2 = (-b - sqrtD) / (2 * a);
                System.out.printf("Ikkita haqiqiy ildiz: x1 = %.4f, x2 = %.4f\n", x1, x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.printf("Bitta takroriy ildiz: x = %.4f\n", x);
            } else {
                System.out.println("Haqiqiy ildizlar yo'q (D < 0). Kompleks ildizlar mavjud.");
            }
        }
    }
}
