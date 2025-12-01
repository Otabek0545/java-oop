import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int gorizontal = a / c;
        int vertikal = b / c;

        int jami = gorizontal * vertikal;
        System.out.println(jami);
    }
}
