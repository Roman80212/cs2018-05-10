package by.it._tasks_.bukovp.lesson02;

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
        int num1, num2, sumdec;
        System.out.println("Вот пример ввода с клавиатуры:: ");
        Scanner sc1 = new Scanner(System.in);
        num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        num2 = sc2.nextInt();
        sumdec = num1 + num2;
        String convertbin1 = Integer.toBinaryString(num1);
        String convertbin2 = Integer.toBinaryString(num2);
        String  convertoct1 = Integer.toOctalString(num1);
        String  convertoct2 = Integer.toOctalString(num2);
        String  converthex1 = Integer.toHexString(num1).toUpperCase();
        String  converthex2 = Integer.toHexString(num2).toUpperCase();
        System.out.println("Тогда вывод ожидается такой:");
        System.out.println("DEC:" + num1 + "+" + num2 + "=" + sumdec);
        String sumbin = Integer.toBinaryString(sumdec);
        String sumoct = Integer.toOctalString(sumdec);
        String sumhex = Integer.toHexString(sumdec);
        System.out.println("BIN:" + convertbin1 + "+" + convertbin2 + "=" + sumbin);
        System.out.println("HEX:" + converthex1 + "+" + converthex2 + "=" + sumhex);
        System.out.println("OCT:" + convertoct1 + "+" + convertoct2 + "=" + sumoct);
    }
}
