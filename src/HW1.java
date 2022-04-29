import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
/*
Создать массив дробных чисел double длиной 5 с именем doubles
Вывести массив с помощью Arrays.toString()
Заполнить по очереди все элементы с помощью операции получения элемента по индексу
Вывести массив с помощью Arrays.toString()
Изменить первый элемент на 1.00001, последний элемент на -0.189
Вывести массив с помощью Arrays.toString()
 */
        double [] doubles = new double[5];
        System.out.println(Arrays.toString(doubles));
        for (int index = 0 ; index < doubles.length; index++){
            double element = index;
            doubles[index] = element;
        }
        System.out.println(Arrays.toString(doubles));
        doubles[0] = 1.00001;
        doubles[doubles.length - 1] = -0.189;
        System.out.println(Arrays.toString(doubles));
    }
}




