package by.it.tkulesh.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        ArrayList<Integer> M=new ArrayList();
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <=19 ; i++) {
            int t=scan.nextInt();
            M.add(t);
        }
        ArrayList<Integer> a=new ArrayList();
        ArrayList<Integer> b=new ArrayList();
        for (int i = 0; i < 10; i++) {
            int s = M.get(i);
            a.add(s);
        }
        for (int i = 10; i < 20; i++) {
            int s = M.get(i);
            b.add(s);}
            System.out.println("a="+a);
                System.out.println("b="+b);
        }
    }

