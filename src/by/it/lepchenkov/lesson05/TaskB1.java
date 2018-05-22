package by.it.lepchenkov.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int l;
        do {
            String value = sc.next();
            strings.add(value);
            l = strings.size();
        } while (l != 5);
        System.out.println(strings.size());
        for (int i = 0; i < l; i++) {
            System.out.println(strings.get(i));
        }
    }
}
