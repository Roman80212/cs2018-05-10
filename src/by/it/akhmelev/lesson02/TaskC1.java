package by.it.akhmelev.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        System.out.println("Sum = " + (i + j));

    }


}
