package by.it.dariadzel.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
       /* int array[] = new int[20];
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int x: array) {
            sort(array);
            System.out.println(array);
        }

    }


    public static void sort(ArrayList<Integer> array) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(array.get(0));
        for (int i = 0; i < array.size(); i++) arr.add(array.get(i));


        for (int i = 0; i < array.size(); i++) {

            int max = array.get(i);
            int imax = i;

            for (int j = i + 1; j < array.size(); j++) {


                if (max < array.get(j)) {
                    max = array.get(j);
                    imax = j;
                }
            }


            if (i != max) {
                int temp = array.get(i);
                array.set(i, array.get(imax));
                array.set(imax, temp);


                for (i = 0; i < array.size() - 1; i++) {
                    for (int j = array.size() - 1; j >= i; j--) {
                        if (array.get(j - 1) > array.get(j)) {
                            int t = array.get(j - 1);
                            array.set(j - 1, array.get(j));
                            array.set(j, t);
                        }
                    }
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.get(i);
        }*/
    }
}