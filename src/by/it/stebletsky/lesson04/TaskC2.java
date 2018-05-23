package by.it.stebletsky.lesson04;

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
        System.out.println("Введите номер дня и месяца: ");
        Scanner sc = new Scanner(System.in);
        int d= sc.nextInt();
        int m= sc.nextInt();
        int d1=31, d2=28, d3=31, d4=30, d5=31, d6=30, d7=31, d8=31, d9=30, d10=31, d11=30, d12=31;
        switch (m) {
            case 1:
                System.out.println(d);break;
            case 2:
                System.out.println(d1+d); break;
            case 3:
                System.out.println(d1+d2+d); break;
            case 4:
                System.out.println(d1+d2+d3+d); break;
            case 5:
                System.out.println(d1+d2+d3+d4+d); break;
            case 6:
                System.out.println(d1+d2+d3+d4+d5+d); break;
            case 7:
                System.out.println(d1+d2+d3+d4+d5+d6+d); break;
            case 8:
                System.out.println(d1+d2+d3+d4+d5+d6+d7+d); break;
            case 9:
                System.out.println(d1+d2+d3+d4+d5+d6+d7+d8+d); break;
            case 10:
                System.out.println(d1+d2+d3+d4+d5+d6+d7+d8+d9+d); break;
            case 11:
                System.out.println(d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d); break;
            case 12:
                System.out.println(d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d1+d-1); break;

        }

    }
}
