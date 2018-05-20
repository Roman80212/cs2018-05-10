package by.it.bukovp.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] myArray = new int[20];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 20 чисел в массив: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        sort(myArray);
        for (int array : myArray) {
            System.out.println(array);
        }

    }




    public static void sort(int[] array) {
        //Напишите тут ваш код
        int buffer;

        for (int i = 0; i < array.length; i++)
        {
        //Сортируем методом пузрька
            for (int j = 0; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    buffer = array[j];
                    array[j] = array[i];
                    array[i] = buffer;
                }
            }
        }
    }

}
