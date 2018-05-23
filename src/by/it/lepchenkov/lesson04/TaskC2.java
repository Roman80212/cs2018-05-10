package by.it.lepchenkov.lesson04;

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
import java.util.Scanner;
public class TaskC2 {
    static int daysInMonth(int x) {
        int daysQuantity;
        switch (x) {
            case 1:
                daysQuantity = 31;
                break;
            case 2:
                daysQuantity = 28;
                break;
            case 3:
                daysQuantity = 31;
                break;
            case 4:
                daysQuantity = 30;
                break;
            case 5:
                daysQuantity = 31;
                break;
            case 6:
                daysQuantity = 30;
                break;
            case 7:
                daysQuantity = 31;
                break;
            case 8:
                daysQuantity = 31;
                break;
            case 9:
                daysQuantity = 30;
                break;
            case 10:
                daysQuantity = 31;
                break;
            case 11:
                daysQuantity = 30;
                break;
            case 12:
                daysQuantity = 31;
                break;
                default:
                    daysQuantity = 300;
        }
        return daysQuantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int daysQuntityCalc = 0;
        for (int i = 1; i<month; i++){
            daysQuntityCalc = daysQuntityCalc + TaskC2.daysInMonth(i);
        }
        daysQuntityCalc = daysQuntityCalc + day;
        System.out.println(daysQuntityCalc);
    }
}
