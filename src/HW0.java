import java.util.Arrays;
import java.util.Scanner;

public class HW0 {
    public static void main(String[] args) {
 /*
        Спросить у пользователя целое положительное число m
        (если хотите, через бесконечный цикл)
        Создать массив дробных чисел длиной m
        Заполнить каждый элемент по формуле i * i + 0.5 , где i - индекс элемента
        Вывести весь массив на экран
         */

        Scanner sc = new Scanner(System.in);
        double array[];
        System.out.println("Введите положительное число");
        while (true){
            int k = sc.nextInt();

            if (k > 0) {
                array = new double[k];
                for (int index = 0; index < array.length; index++) {
                double element = index * index + 0.5;
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