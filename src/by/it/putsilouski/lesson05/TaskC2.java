package by.it.putsilouski.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int[] a = new int[20];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < (a.length); i++) {
            int x = scan.nextInt();
            a[i] = x;
        }
        sort(a);
    }
    //Напишите тут ваш код
    public static void sort(int[] array) {

        int i = 0;
        int goodPairsCounter = 0;
        while (true) {
            if (array[i] < array[i + 1]) {
                int q = array[i];
                array[i] = array[i + 1];
                array[i + 1] = q;
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == array.length - 1) {
                i = 0;
            }
            if (goodPairsCounter == array.length - 1) break;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);

        }

    }

}
