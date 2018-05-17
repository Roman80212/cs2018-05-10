package by.it.klitvin.lesson02;

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
        System.out.println("Введите любых два числа:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        System.out.println("Sum" + " = " + c);

}




}
