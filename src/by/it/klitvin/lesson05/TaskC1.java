package by.it.klitvin.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> listb = new ArrayList<Integer>();
        ArrayList<Integer> listc = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer i: list)
        {
            if (i % 3 == 0 && i % 2 == 0){
                lista.add(i);
                listb.add(i);
            }
            else if (i % 3 == 0)
                lista.add(i);
            else if (i % 2 == 0)
                listb.add(i);
            else
                listc.add(i);
        }
        printList(lista);
        printList(listb);
        printList(listc);
    }

    public static void printList(List<Integer> list)
    {
        for (Integer i : list){
            System.out.println(i);

        }
    }
}
