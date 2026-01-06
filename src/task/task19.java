package task;

import java.util.Scanner;
public class task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        To'g'ri to'rtburchakning qarama-qarshi uchlari koordinatalari berilgan.
//        Uning tomonlari koordinata o'qiga parallel.To'g'ri to'rtburchakning perimetri va yuzasi aniqlansin!

        System.out.print("x1 = "); double x1 = scanner.nextDouble();
        System.out.print("x2 = "); double x2 = scanner.nextDouble();
        System.out.print("y1 = "); double y1 = scanner.nextDouble();
        System.out.print("y2 = "); double y2 = scanner.nextDouble();
        double width = Math.abs(x2-x1);
        double heigh = Math.abs(y2-y1);
        if (width==0 || heigh==0){
            System.out.println("To'g'ri to'rtburchakning eni yoki bo'yi 0 ga teng bo'lishi mumkin emas!");
        }
        double perimeter = 2*(width+heigh);
        double area = width*heigh;
        System.out.println("Perimeter P = "+perimeter);
        System.out.println("Area S = "+area);
    }
}
