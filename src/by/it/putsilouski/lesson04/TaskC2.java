package by.it.putsilouski.lesson04;

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
        run("1 1").include("1");
        run("31 12").include("365");
        run("13 9").include("256");
        run("0 1").include("0");
        run("8 3").include("67");

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int chislo;
        int data1 = in.nextInt();
        int data2 = in.nextInt();
        for (int i = 1; i <= data2; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                chislo = 30;
            } else
                chislo = 31;
            if (i == 2) {
                chislo = 28;
            }
            if (i == data2) {
                chislo = data1;
            }
            for (int j = 1; j <= chislo; j++) {
                number++;
            }
        }
        System.out.println(number);
    }
}
