package by.it.dgus.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int m[] = new int[20];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            m[i] = scan.nextInt();
        }
        sort(m);
    }

    public static void sort(int[] array) {
        //Напишите тут ваш код
        int x;
        for (int i = 1; i < array.length; i++)
            for (int j = array.length-1; j >=i ; j--) {
            if (array[j-1] < array[j]){
            x = array[j-1];
            array[j-1] = array[j];
            array[j] = x;}}
        for(int element: array){
            System.out.println(element);
        }
    }}


