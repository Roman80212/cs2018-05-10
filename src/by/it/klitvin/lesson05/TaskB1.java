package by.it.klitvin.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list=new ArrayList();

        list.add("У лукоморья дуб зелёный;");
        list.add("Златая цепь на дубе том:");
        list.add("И днём и ночью кот учёный");
        list.add("Всё ходит по цепи кругом;");
        list.add("Идёт направо - песнь заводит.");

        System.out.println(list.size());

        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }

    }
}

