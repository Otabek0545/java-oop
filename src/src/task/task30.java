package task;

import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        a burchak radianda berilgan (0<a<2Pi).Berilgan burchakning qiymatini gradusga o'tkazuvchi dastur tuzing!

        System.out.print("radian = ");
        double radian = scanner.nextDouble();
        double gradus = Math.toDegrees(radian);
        System.out.println("gradus = " + gradus + " gradus");
    }
}
