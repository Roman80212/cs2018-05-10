package by.it.lepchenkov.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/

import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        int l = 0;
        do {
            int value = l + 1;
            ints.add(value);
            l = ints.size();
        } while (l != 5);
        System.out.println(ints.size());
        for (int i = 0; i < l; i++) {
            System.out.println(ints.get(i));
        }
    }
}
