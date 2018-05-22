package by.it.putsilouski.lesson05;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList a = new ArrayList();
        ArrayList onthree = new ArrayList();
        ArrayList ontwo = new ArrayList();
        ArrayList other = new ArrayList();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int x = scan.nextInt();
            if (x % 3 == 0) {
                onthree.add(x);
            }
            if (x % 2 == 0) {
                ontwo.add(x);
            }
            if ((x % 2 != 0) && (x % 3 != 0)) {
                other.add(x);
            }
        }
        printList(onthree);
        printList(ontwo);
        printList(other);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }
}
