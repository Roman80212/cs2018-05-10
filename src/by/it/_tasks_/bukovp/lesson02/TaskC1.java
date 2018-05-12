package by.it._tasks_.bukovp.lesson02;


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
        int number;
        System.out.println("Ввод:");
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.print(num1);
        System.out.print(num2);
        number = num1.nextInt() + num2.nextInt();
        System.out.println("Вывод");
        System.out.println("Sum = " + number);
    }
}
