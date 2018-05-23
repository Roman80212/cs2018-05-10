package by.it.bukovp.lesson05;
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
        ArrayList<String> list = new ArrayList<>();
        list.add("Строка 1");
        list.add("Строка 22");
        list.add("Строка 333");
        list.add("Строка 4444");
        list.add("Строка 55555");
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5 ; i++) {
//            String str = sc.next();
//            list.add(str);
//        }
        System.out.println(list.size());
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
