package by.it._tasks_.bukovp.lesson02;

/*
Выводим квадрат числа
Напишите программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.

Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать число типа Int с клавиатуры.
4. Программа должна выводить квадрат считанного числа.

 */

import java.util.Scanner;

class TaskB1 {
    public static void main(String[] args) {
        int num, result;
        System.out.println("Введите число с клавиатуры: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        result = num*num;
        System.out.println("Квадрат введенного Вами числа равен: " + result);

    }
}
