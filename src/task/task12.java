package task;

import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        To'g'ri uchburchakning katetlari a va b berilgan. Gipotenuzasi c va perimetri P topilsin!
        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        double c = Math.pow(Math.pow(a,2)+Math.pow(b,2),0.5);
        double p = a+b+c;
        System.out.println("c = "+c);
        System.out.println("P = "+p);
    }
}
