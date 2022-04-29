import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*
Спросить у пользователя целое положительное число
Создать целочисленный массив такой же длины
С помощью цикла (for или while) заполнить этот массив по правилу:
Каждый элемент равен его индексу, умноженному на 11
После заполнения, вывести массив
Например, если пользователь введет 6, то должен получиться массив [0, 11, 22, 33, 44, 55]
 */
        Scanner sc = new Scanner(System.in);
        int array[];
        System.out.println("Введите положительное число");
        while (true){
            int k = sc.nextInt();

            if (k > 0) {
                array = new int[k];
                for (int index = 0; index < array.length; index++) {
                    int element = index * 11;
                    array[index] = element;
                }
                System.out.println(Arrays.toString(array));
                break;
            } else {
                System.out.println("Введите положительное число");
            }
        }
    }
}
