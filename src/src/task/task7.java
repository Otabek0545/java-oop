package task;

import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Doiraning radiusi R berilgan,uning uzunligi L va yuzasi S aniqlansin! L=2*Pi*R S=Pi*R*R
        System.out.print("R = "); double r = scanner.nextDouble();
        System.out.println("L = "+2*Math.PI*r);
        System.out.print("S = "+ Math.PI*Math.pow(r,2));
    }
}
