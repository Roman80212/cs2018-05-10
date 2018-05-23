package by.it.bukovp.lesson05;
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
    {
        ArrayList<Integer> biglist = new ArrayList<>();
        ArrayList<Integer> firstlist = new ArrayList<>();
        ArrayList<Integer> secondlist = new ArrayList<>();
        ArrayList<Integer> anotherlist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 20 чисел в список: ");
        for (int i = 0; i < 20; i++) {
            int num = scan.nextInt();
            biglist.add(num);
        }
        for (int j = 0; j < 20; j++) {
            if(biglist.get(j)%3 == 0){
                int num1 = biglist.get(j);
                firstlist.add(num1);
            }
        }
        for (int k = 0; k < 20; k++) {
            if(biglist.get(k)%2 == 0) {
                int num2 = biglist.get(k);
                secondlist.add(num2);
            }
        }
        for (int w = 0; w < 20; w++) {
            if(biglist.get(w)%3 != 0 && biglist.get(w)%2 != 0) {
                int num3 = biglist.get(w);
                anotherlist.add(num3);
            }
        }
        //printList(biglist);
        printList(firstlist);
        //System.out.println("/n/n/n");
        printList(secondlist);
        //System.out.println("/n/n/n");
        printList(anotherlist);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
