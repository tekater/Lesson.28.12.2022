import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b;

        /* if (a > b) {
            max = a;
        } else {
            max = b;
        }*/
        System.out.println(max);
    }
}