package by.it.emiashkou.lesson05;
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
        ArrayList<String> strings = new ArrayList<>();
        strings.add("жили у");
        strings.add("бабуси");
        strings.add("два");
        strings.add("веселых");
        strings.add("гуся");
        System.out.println(strings.size());

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
