package by.it.stebletsky.lesson02;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        sc.close();
        System.out.println("Sum = " + sum);

    }
}
