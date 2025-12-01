import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        0 ga teng bo'lmagan 2ta son berilgan,ularning yig'indisi,ko'paytmasi va har birining kvadrati aniqlansin!
        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        System.out.println("a+b = "+(a+b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a ni kvadrati = "+Math.pow(a,2));
        System.out.print("b ni kvadrati = "+Math.pow(b,2));
    }
}
