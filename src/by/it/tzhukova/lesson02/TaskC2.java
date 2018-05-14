package by.it.tzhukova.lesson02;

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

import java.util.Scanner;

class TaskC2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = i + j;
        String ii = Integer.toBinaryString(i);
        String jj = Integer.toBinaryString(j);
        String kk = Integer.toBinaryString(k);
        System.out.printf("%s%d%s%d%s%d%n", "DEC:", i,"+",j,"=",k);
        System.out.printf("%s%s%s%s%s%s%n", "BIN:", ii,"+",jj,"=",kk);
        System.out.printf("%s%x%s%x%s%x%n", "HEX:", i,"+",j,"=",k);
        System.out.printf("%s%o%s%o%s%o%n", "OCT:", i,"+",j,"=",k);



    }


}
