import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цифру дважды");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Первый случай использования тернарного оператора - Start
        int max = a > b ? a : b; // тернарный оператор

        /* if (a > b) {
            max = a;
        } else {
            max = b;
        }*/

        // Первый случай использования тернарного оператора - end
        //
        // Второй случай использования тернарного оператора - start
        String result = a == b ? "equal" :
                a > b ? "more" : "less";
        System.out.println(result);
        if ( a == b) {
            result = "равно";
        } else if (a > b) {
            result = "больше";
        }else {
            result = "меньше";
        } System.out.println(result);
        // Второй случай использования тернарного оператора - end
        System.out.println(max);
        // Тернарный оператор - start
        //                  if (10 > 9)              "выражение верно" "выражение не верно"
        //String result = выражение сравнения ? если верно выражние : сли выражение не верно;
        // Тернарный оператор - end
    }
}
