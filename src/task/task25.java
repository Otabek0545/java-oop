package task;

import java.util.Scanner;
public class task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        x ning qiymati berilganda y=3x^6-6x^2-7 funksiyaning qiymati aniqlansin!
        System.out.print("x = "); double x = scanner.nextDouble();
        double y = 3*Math.pow(x,6)-6*Math.pow(x,2)-7;
        System.out.println("y = 3x^6-6x^2-7 = "+y);
    }
}
