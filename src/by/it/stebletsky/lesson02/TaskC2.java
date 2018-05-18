package by.it.stebletsky.lesson02;

import java.awt.image.Kernel;
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
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int k = in.nextInt();
        int sum = i+k;
        System.out.println("DEC:" + i + "+" + k + "=" + sum);
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(k) + "=" + Integer.toBinaryString(sum));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(k) + "=" + Integer.toHexString(sum));
        System.out.println("OCT:" + Integer.toOctalString(i) + "+" + Integer.toOctalString(k) + "=" + Integer.toOctalString(sum));

    }

}
