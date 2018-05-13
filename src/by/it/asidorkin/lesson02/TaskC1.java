package by.it.asidorkin.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {

    public static void main  (String[] args){
        System.out.println("Введите число 'a'");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число 'b'");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        int c = a+b;
        System.out.println("Sum = " + c);
    }




}
