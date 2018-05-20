package by.it.tkulesh.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


public class TaskB1 {
    public static void main(String[] args) {
        String [] lines={"one", "two", "three", "four", "five" };
        System.out.println(lines.length);
        for (String x : lines)
        {System.out.print(x);
            System.out.print("\n");}

    }
    }


