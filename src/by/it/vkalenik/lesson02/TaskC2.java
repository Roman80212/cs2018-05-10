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
//      String b = Integer.toBinaryString(b);
//      String i = Integer.toBinaryString(i);
        String binary = Integer.toBinaryString(a);
        if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
        binary = String.format("%8s", binary).replace(" ", "0");
        System.out.printf(binary, "BIN: " + i + "+" + a + "= " + b);
    }
}


