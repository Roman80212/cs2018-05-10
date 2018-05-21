package by.it.lepchenkov.lesson05;
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

import by.it.lepchenkov.lesson04.TaskC3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> numbersDiv3=new ArrayList<>();
        ArrayList<Integer> numbersDiv2=new ArrayList<>();
        ArrayList<Integer> numbersTheRest=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while (numbers.size()<20){
            String value = sc.next();
            Integer valueInt = Integer.parseInt(value);
            numbers.add(valueInt);
        }

        for (int i =  0; i<=numbers.size() - 1;i++) {
            int x = numbers.get(i);
            if (x % 3 == 0 && x % 2 == 0){
                numbersDiv3.add(x);
                numbersDiv2.add(x);
            }
            else if (x % 2 == 0){
                numbersDiv2.add(x);
            }
            else if (x % 3 == 0){
                numbersDiv3.add(x);
            }
            else {
                numbersTheRest.add(x);
            }
        }

        TaskC1.printList(numbersDiv3);
        TaskC1.printList(numbersDiv2);
        TaskC1.printList(numbersTheRest);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
