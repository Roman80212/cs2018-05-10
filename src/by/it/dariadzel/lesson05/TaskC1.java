package by.it.dariadzel.lesson05;
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
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        int i;
        Scanner sc = new Scanner(System.in);
                for (i = 0; i < 20; i++) {
            list.add(sc.nextInt());
        }

        for (i = 0; i < list.size(); i++) {

            Integer k = list.get(i);
            if  (k % 3 == 0 && k % 2 == 0){
                three.add(k);
                two.add(k);}
            if (k % 3 == 0){
                if(k % 2 != 0){
                    three.add(k);}}
            else
            if (k % 2 == 0){
                if(k % 3 != 0)
                    two.add(k); }
            else
                other.add(k);




         /*   if (x % 3 == 0 ) {

                three.add(x);
            } else if (x % 2 == 0) {
                two.add(x);
            } else {
                other.add(x);
            }*/
        }

        printList(three);
        printList(two);
        printList(other);

    }


    private static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
                    }
            }


}
