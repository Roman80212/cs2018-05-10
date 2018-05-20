package by.it.tkulesh.lesson05;
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
    public static void main(String[] args) throws Exception
    {ArrayList<Integer> numb= new ArrayList(20);
        ArrayList<Integer> tri= new ArrayList();
        ArrayList<Integer> dva= new ArrayList();
        ArrayList<Integer> ost= new ArrayList();

Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int t =scan.nextInt();
            numb.add(t);
        }
        for (int i = 0; i <20 ; i++) {
            int x = numb.get(i);
            if (x%3==0) tri.add(x);
            if (x%2==0) dva.add(x);
            if (x%2!=0 && x%3!=0) ost.add(x);
        }
for (Integer x : tri) System.out.println(x);
        for (Integer y: dva) System.out.println(y);
        for (Integer z: ost) System.out.println(z);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
