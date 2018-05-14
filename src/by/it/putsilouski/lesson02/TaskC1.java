package by.it.putsilouski.lesson02;

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
        Scanner in = new Scanner(System.in);
        int input_1 = in.nextInt();
        int input_2 = in.nextInt();
        int summ = + input_1 + input_2;
        System.out.println("Sum = " + summ);
    }
}
