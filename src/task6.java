import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        paralilipipedning tomonlari a,b,c berilgan.Uning hajmi V=a*b*c va to'la sirti S=2*(a*b+b*c+a*c) aniqlansin!

        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        System.out.print("c = "); double c = scanner.nextDouble();
        System.out.println("V = "+a*b*c);
        System.out.print("S = "+2*(a*b+b*c+a*c));
    }
}
