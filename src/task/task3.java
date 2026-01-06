package task;

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
//        togri tortburchakning tomonlari a va b berilgan uning p=2*(a+b) va yuzi S=a*b aniqlang!
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.println("P = "+2*(a+b));
        System.out.print("S = "+(a*b));
    }
}
