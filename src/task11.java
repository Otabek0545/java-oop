import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        0 ga teng bo'lmagan 2ta son berilgan,ularning yig'indisi,ko'paytmasi va har birining moduli aniqlansin!
        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        double sum = a+b;
        double multiple = a*b;
        double absA = Math.abs(a);
        double absB = Math.abs(b);
        System.out.println("a+b = "+sum);
        System.out.println("a*b = "+multiple);
        System.out.println("a ni moduli = "+absA);
        System.out.println("b ni moduli = "+absB);


    }
}
