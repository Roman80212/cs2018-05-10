package by.it.lepchenkov.lesson02;

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
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = n1 + n2;
        System.out.println("DEC:" + n1 + "+" + n2 + "=" + n3);

        String binaryNumber1 = Integer.toBinaryString(n1);
        String binaryNumber2 = Integer.toBinaryString(n2);
        String binaryNumber3 = Integer.toBinaryString(n3);
        System.out.println("BIN:" + binaryNumber1 + "+" + binaryNumber2 + "=" + binaryNumber3);

        String hexNumber1 = Integer.toHexString(n1);
        String hexNumber2 = Integer.toHexString(n2);
        String hexNumber3 = Integer.toHexString(n3);
        System.out.println("HEX:" + hexNumber1 + "+" + hexNumber2 + "=" + hexNumber3);

        String strOctalNumber1 = Integer.toOctalString(n1);
        String strOctalNumber2 = Integer.toOctalString(n2);
        String strOctalNumber3 = Integer.toOctalString(n3);
        System.out.println("OCT:" + strOctalNumber1 + "+" + strOctalNumber2 + "=" + strOctalNumber3);
    }
}
