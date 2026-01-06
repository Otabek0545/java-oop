public class Task2_29 {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        for (char ch : chars) {
            System.out.printf("'%c' belgisi %d\n", ch, (int) ch,  "qiymatga ega");
        }
    }
}
