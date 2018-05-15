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
 //2
        Integer number = i;
        String q = Integer.toBinaryString(number);

        Integer n = x;
        String w = Integer.toBinaryString(n);

        Integer k = z;
        String g = Integer.toBinaryString(k);
        System.out.println("BIN:" + w +"+" +q+ "="+g);
//16

        g = Integer.toHexString(k).toUpperCase();

        q = Integer.toHexString(number).toUpperCase();

        w = Integer.toHexString(n).toUpperCase();
        System.out.println("HEX:" + w +"+" +q+ "="+g);   //w
 //8
        q = Integer.toOctalString(number);
        System.out.println(q);
        w = Integer.toOctalString(n);
        System.out.println(w);

    }

}
