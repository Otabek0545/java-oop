import java.util.Scanner;

public class Integer26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int boshlangich = 2;
        int natija = (boshlangich + k - 1) % 7;

        System.out.println(natija);
    }
}
