package by.it.Yrkevich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Парам");
        list.add("пам");
        list.add("пам");
        list.add("картошка");
        list.add("огурец");

        System.out.println(list.size());

        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

    }
}