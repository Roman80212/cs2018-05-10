package by.it.asidorkin.lesson05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList <String> list  = new ArrayList();
    while (true){
        String s=scan.next();
        if (s.equals("END")) break;
        list.add(s);
        int j=list.size();

    }
    System.out.println(list);
}
}
