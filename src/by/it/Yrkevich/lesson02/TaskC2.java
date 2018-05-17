package by.it.Yrkevich.lesson02;

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
        int x = sc.nextInt();
        int z = i + x;
        System.out.println("DEC:" + i + "+" + x + "=" + z);

        String bi = Integer.toBinaryString(i);
        String bx = Integer.toBinaryString(x);
        String bs = Integer.toBinaryString(i + x);
        System.out.println("BIN:" + bi + "+" + bx  + "=" + bs);

        String hi = Integer.toHexString(i);
        String hx = Integer.toHexString(x);
        String hs= Integer.toHexString(i+x);
        System.out.println("HEX:" + hi + "+" + hx  + "=" + hs);

        String oi = Integer.toOctalString(i);
        String ox = Integer.toOctalString(x);
        String os = Integer.toOctalString(i+x);
        System.out.println("OCT:" + oi + "+" + ox  + "=" + os);




    }

}
