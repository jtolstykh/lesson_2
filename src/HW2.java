import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*
Спросить у пользователя одно целое число типа int
С помощью цикла while вывести столько же раз фразу "Цикл while"
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num = scanner.nextInt();
        if (num < 0) {
            num = Math.abs(num);
        }
        while (num > 0) {
            System.out.println("Цикл while");
            num = num - 1;
        }
    }
}
