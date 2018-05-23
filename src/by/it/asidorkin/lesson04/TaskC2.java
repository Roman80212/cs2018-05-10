package by.it.asidorkin.lesson04;

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
        int dd=scan.nextInt();
        int mm=scan.nextInt();
        int x=0;
        int i=1;
        while (i<mm){
            switch (i) {
                case 1:
                    x=x+31;
                    break;
                case 2:
                    x=x+28;
                    break;
                case 3:
                    x=x+31;
                    break;
                case 4:
                    x=x+30;
                    break;
                case 5:
                    x=x+31;
                    break;
                case 6:
                    x=x+30;
                    break;
                case 7:
                    x=x+31;
                    break;
                case 8:
                    x=x+31;
                    break;
                case 9:
                    x=x+30;
                    break;
                case 10:
                    x=x+31;
                    break;
                case 11:
                    x=x+30;
                    break;
                case 12:
                    x=x+31;
                    break;

            }i++;}
        System.out.println(x+dd);
    }
}
