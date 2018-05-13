package by.it.klitvin.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {

        System.out.println("Введите любых два числа:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
            for (int i = 0; i < 5 ; i++)        {

                System.out.println("DEC" + ":" + a + "+" + b + "=" + c);
        System.out.println("BIN" + ":" + Integer.toBinaryString(a) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(c));
        System.out.println("HEX" + ":" + Integer.toHexString(a) + "+" + Integer.toHexString(b) + "=" + Integer.toHexString(c));
        System.out.println("OCT" + ":" + Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(c));
            }
    }


}
