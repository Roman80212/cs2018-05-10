package by.it.klitvin.lesson04;

import java.sql.SQLOutput;
import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        System.out.println("Ввод:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
         if (b==1)
             System.out.println("Вывод:" + a);
         if (b==2)
             System.out.println("Вывод:" + (a+31));
        if (b==3)
            System.out.println("Вывод:" +(a+59));
        if (b==4)
            System.out.println("Вывод:" +(a+90));
        if (b==5)
            System.out.println("Вывод:" +(a+120));
        if (b==6)
            System.out.println("Вывод:" +(a+151));
        if (b==7)
            System.out.println("Вывод:" +(a+181));
        if (b==8)
            System.out.println("Вывод:" +(a+212));
        if (b==9)
            System.out.println("Вывод:" +(a+243));
        if (b==10)
            System.out.println("Вывод:" +(a+273));
        if (b==11)
            System.out.println("Вывод:" +(a+304));
        if (b==12)
            System.out.println("Вывод:" +(a+334));
    }
}
