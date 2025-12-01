import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        x kg konfet A so'm turadi. 1kg va Y kg konfet qancha turishini toping.

        System.out.print("x (kg) ni kiriting: ");
        double x = scanner.nextDouble();

        System.out.print("A (so'm) ni kiriting: ");
        double a = scanner.nextDouble();

        System.out.print("Y (kg) ni kiriting: ");
        double y = scanner.nextDouble();

        double pricePerKg = a / x;

        double priceYkg = pricePerKg * y;

        System.out.printf("1 kg konfet narxi: %.2f so'm\n", pricePerKg);
        System.out.printf("%.2f kg konfet narxi: %.2f so'm\n", y, priceYkg);
    }
}
