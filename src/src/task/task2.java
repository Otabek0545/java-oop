package task;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

//        task1: kvadrat tomoni a berilgan. uning yuzini S=a*a aniqlansin!

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadrat tomonini kiriitng:");
        double a = scanner.nextDouble();
        double s = Math.pow(a,2);
        System.out.println("S = "+s);
    }
}
