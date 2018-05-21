package by.it.asidorkin.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskC2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        int i = 0;
        while (i < 20) {
            int x = scan.nextInt();
            list.add(x);
            i++;
        }

sort(list);
    }
    public static void sort(ArrayList<Integer> array) {
Collections.sort(array);Collections.reverse(array);
        for (Integer aList : array) System.out.println(aList);
    }

}
