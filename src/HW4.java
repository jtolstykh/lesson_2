import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /*
Спросить у пользователя целое положительное число m
Создать целочисленный массив длины m
С помощью цикла (for или while) заполнить этот массив из ввода пользователя,
т.е. спросить у пользователя целое число m раз и записать эти числа по очереди в массив
Вывести массив с помощью Arrays.toString()
Задание со "звёздочкой":
рассчитать сумму элементов в массиве и вывести её
 */
        Scanner sc = new Scanner(System.in);
        int [] array;
        int arraySum = 0;
        System.out.println("Введите целое положительное число");

        while (true){
            int m = sc.nextInt();

            if (m > 0) {
                array = new int[m];

                for (int index = 0; index < array.length; index++) {
                    System.out.println("Введите целое число");
                    int input = sc.nextInt();
                    array[index] = input;
                    arraySum = arraySum + input;
                }

                System.out.println(Arrays.toString(array));
                System.out.println("Сумма элементов массива: " + arraySum);
                break;

            } else {
                System.out.println("Введите целое положительное число");
            }

        }

    }
}


