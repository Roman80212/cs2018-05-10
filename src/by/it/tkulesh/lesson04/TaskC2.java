package by.it.tkulesh.lesson04;

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
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int m = scan.nextInt();
        int numb;
        if (m == 1) {
            numb = d;
            System.out.println(numb);
        }
        if (m == 2) {
            numb = 31 + d;
            System.out.println(numb);
        }
        if (m == 3) {
            numb = 31 + 28 + d;
            System.out.println(numb);
        }
        if (m == 4) {
            numb = 31 + 28 + 31 + d;
            System.out.println(numb);
        }
        if (m == 5) {
            numb = 31 + 28 + 31 + 30 + d;
            System.out.println(numb);
        }
        if (m == 6) {
            numb = 31 + 28 + 31 + 30 + 31 + d;
            System.out.println(numb);
        }
        if (m == 7) {
            numb = 31 + 28 + 31 + 30 + 31 + 30 + d;
            System.out.println(numb);
        }
        if (m == 8) {
            numb = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
            System.out.println(numb);
        }
        if (m == 9) {
            numb = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
            System.out.println(numb);
        }
        if (m == 10) {
            numb = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
            System.out.println(numb);
        }
        if (m == 11) {
            numb = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
            System.out.println(numb);
        }
        if (m == 12) {
            numb = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
            System.out.println(numb);
        }


    }

}
