package by.it.emiashkou.lesson02;

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
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int c=sc.nextInt();
        int sum=i+c;
        String j=Integer.toBinaryString(i);
        String d=Integer.toBinaryString(c);
        String k=Integer.toBinaryString(sum);
        String j1=Integer.toHexString(i);
        String d1=Integer.toHexString(c);
        String k1=Integer.toHexString(sum);
        String j2=Integer.toOctalString(i);
        String d2=Integer.toOctalString(c);
        String k2=Integer.toOctalString(sum);
        System.out.println("DEC" + ":" + i +  "+" + c + "=" + sum);
        System.out.println("BIN" + ":" + j +  "+" + d + "=" + k);
        System.out.println("HEX" + ":" + j1 +  "+" + d1 + "=" + k1);
        System.out.println("OCT" + ":" + j2 +  "+" + d2 + "=" + k2);
    }

}
