package by.it.vkalenik.lesson02;

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
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int a = sc.nextInt();
        int b = i + a;
        System.out.println("DEC: " + i + "+" + a + "= " + b);
        String bi = Integer.toBinaryString(i);
        String ba = Integer.toBinaryString(a);
        String bb = Integer.toBinaryString(b);
        System.out.println("BIN: " + bi + "+" + ba + "= " + bb);
        String hi = Integer.toHexString(i);
        String ha = Integer.toHexString(a);
        String hb = Integer.toHexString(b);
        System.out.println("HEX: " + hi + "+" + ha + "= " + hb);
        String oi = Integer.toOctalString(i);
        String oa = Integer.toOctalString(a);
        String ob = Integer.toOctalString(b);
        System.out.println("DEC: " + oi + "+" + oa + "= " + ob);
    }
}

