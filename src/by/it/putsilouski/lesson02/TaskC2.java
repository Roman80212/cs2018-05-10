package by.it.putsilouski.lesson02;

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
        int input_1 = in.nextInt();
        int input_2 = in.nextInt();
        int DEC1 = input_1;
        int DEC2 = input_2;
        int SUM = DEC1 + DEC2;
        String DE1 = Integer.toString (DEC1);
        String DE2 = Integer.toString (DEC2);
        String DES = Integer.toString (SUM);
        String binary_1 = Integer.toBinaryString(input_1);
        String binary_2 = Integer.toBinaryString(input_2);
        String binary_s = Integer.toBinaryString(SUM);
        String hex_1  = Integer.toHexString(input_1).toUpperCase();
        String hex_2  = Integer.toHexString(input_2).toUpperCase();
        String hex_s  = Integer.toHexString(SUM).toUpperCase();
        String oct_1  = Integer.toOctalString(input_1);
        String oct_2  = Integer.toOctalString(input_2);
        String oct_s  = Integer.toOctalString(SUM);
        System.out.println("DEC:" + DE1 + "+" + DE2 + "=" + DES);
        System.out.println("BIN:" + binary_1 + "+" + binary_2 + "=" + binary_s);
        System.out.println("HEX:" + hex_1 + "+" + hex_2 + "=" + hex_s);
        System.out.println("OCT:" + oct_1 + "+" + oct_2 + "=" + oct_s);
    }
}
