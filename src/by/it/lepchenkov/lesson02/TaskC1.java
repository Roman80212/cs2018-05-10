package by.it.lepchenkov.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/

import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = n1 + n2;
        System.out.println("Sum = " + n3);
    }
}
