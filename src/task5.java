import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Kubning yon tomoni a berilgan.Uning hajmi V=a*a*a va tola sirti S=6*a*a aniqlansin!

        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.println("V = "+ Math.pow(a,3));
        System.out.print("S = "+ 6*Math.pow(a,2));
    }
}
