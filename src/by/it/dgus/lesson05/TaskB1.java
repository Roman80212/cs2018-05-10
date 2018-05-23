package by.it.dgus.lesson05;
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
        ArrayList<String> fife=new ArrayList<>();
        fife.add("Светлая ночь-");
        fife.add("В ярком сиянье луны");
        fife.add("Слива цветет,");
        fife.add("И опадают цветы");
        fife.add("Вместе со снегом");
        int s=fife.size();
        System.out.println(s);
        for (String element: fife){
    System.out.println(element);
}}

    }



