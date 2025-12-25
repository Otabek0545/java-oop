public class Task2_31 {
    public static void main(String[] args) {
        System.out.println("Son | Kvadrat | Kub");
        System.out.println("----------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%3d | %3d     | %d\n", i, i * i, i * i * i);
        }
    }
}
