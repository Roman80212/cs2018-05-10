package by.it.stebletsky.lesson05;
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
        System.out.println("Введите пять строк в список:");
        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            String value = sc.next();
            strings.add(value);
        }
        System.out.println("Размер списка: " + strings.size() + " строк");
        for (String element:strings) {
            System.out.println(element);

        }
    }

}
