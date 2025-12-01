package task;

import java.util.Scanner;
public class task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        A soni berilgan, A ning A^2, A^4, A^8 darajalarini aniqlovchi dastur tuzing.

        System.out.print("A = "); double A = scanner.nextDouble();
        double A2 = Math.pow(A,2);
        double A4 = Math.pow(A,4);
        double A8 = Math.pow(A,8);
        System.out.println("A^2 = "+A2);
        System.out.println("A^4 = "+A4);
        System.out.println("A^8 = "+A8);
    }
}
