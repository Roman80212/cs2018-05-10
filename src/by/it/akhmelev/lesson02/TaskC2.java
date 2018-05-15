package by.it.akhmelev.lesson02;

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
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();

        System.out.println("DEC:"+i+"+"+j+"="+(i+j));
        String bi=Integer.toBinaryString(i);
        String bj=Integer.toBinaryString(j);
        String bs=Integer.toBinaryString(i+j);
        System.out.println("BIN:"+bi+"+"+bj+"="+bs);
        String hi=Integer.toHexString(i);
        String hj=Integer.toHexString(j);
        String hs=Integer.toHexString(i+j);
        System.out.println("HEX:"+hi+"+"+hj+"="+hs);
        String oi=Integer.toOctalString(i);
        String oj=Integer.toOctalString(j);
        String os=Integer.toOctalString(i+j);
        System.out.println("OCT:"+oi+"+"+oj+"="+os);
    }
}
