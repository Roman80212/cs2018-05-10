package by.it.stebletsky.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double x=i, y=i*1.5;
        if (i < 300 | i > 3000) {
            System.out.println("Мы вам перезвоним");
        } else {
            int j;
            for (j = 0; j <= 14; j++) {{if (i==666 | j==666) {break;}}
                switch (j) {
                    case 0:
                        System.out.println("За месяц 0 начислено $0,0"); break;
                    case 1:
                        System.out.println("За месяц январь начислено $" + y);break;
                    case 2:
                        System.out.println("За месяц февраль начислено $" +y);break;
                    case 3:
                        System.out.println("За месяц март начислено $" +y);break;
                    case 4:
                        System.out.println("За месяц апрель начислено $" +y);break;
                    case 5:
                        System.out.println("За месяц май начислено $" +y);break;
                    case 6:
                        System.out.println("За месяц июнь начислено $" +x);break;
                    case 7:
                        System.out.println("За месяц июль начислено $" +x);break;
                    case 8:
                        System.out.println("За месяц август начислено $" +x);break;
                    case 9:
                        System.out.println("За месяц сентябрь начислено $" +y);break;
                    case 10:
                        System.out.println("За месяц октябрь начислено $" +y);break;
                    case 11:
                        System.out.println("За месяц ноябрь начислено $" +y);break;
                    case 12:
                        System.out.println("За месяц декабрь начислено $" +y);break;
                    case 13:
                        System.out.println("За месяц 13 начислено $0,0");break;
                    case 14:
                        System.out.println("За месяц 14 начислено $0,0");

                }
            }
        }

    }
}