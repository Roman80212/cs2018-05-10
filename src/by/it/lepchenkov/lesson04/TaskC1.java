package by.it.lepchenkov.lesson04;

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

import java.util.Scanner;

public class TaskC1 {
    static String monthName(int x) {
        String month;
        switch (x) {
            case 0:
                month = "месяц 0";
                break;
            case 1:
                month = "январь";
                break;
            case 2:
                month = "февраль";
                break;
            case 3:
                month = "март";
                break;
            case 4:
                month = "апрель";
                break;
            case 5:
                month = "май";
                break;
            case 6:
                month = "июнь";
                break;
            case 7:
                month = "июль";
                break;
            case 8:
                month = "август";
                break;
            case 9:
                month = "сентябрь";
                break;
            case 10:
                month = "октябрь";
                break;
            case 11:
                month = "ноябрь";
                break;
            case 12:
                month = "декабрь";
                break;
            case 13:
                month = "месяц 13";
                break;
            case 14:
                month = "месяц 14";
                break;
            default:
                month = "другой месяц";
        }
        return month;
    }

    static double monthSalaryCoefficient(int x) {
        double salaryCoefficient;
        switch (x) {
            case 0:
                salaryCoefficient = 0;
                break;
            case 1:
                salaryCoefficient = 1.5;
                break;
            case 2:
                salaryCoefficient = 1.5;
                break;
            case 3:
                salaryCoefficient = 1.5;
                break;
            case 4:
                salaryCoefficient = 1.5;
                break;
            case 5:
                salaryCoefficient = 1.5;
                break;
            case 6:
                salaryCoefficient = 1;
                break;
            case 7:
                salaryCoefficient = 1;
                break;
            case 8:
                salaryCoefficient = 1;
                break;
            case 9:
                salaryCoefficient = 1.5;
                break;
            case 10:
                salaryCoefficient = 1.5;
                break;
            case 11:
                salaryCoefficient = 1.5;
                break;
            case 12:
                salaryCoefficient = 1.5;
                break;
            case 13:
                salaryCoefficient = 0;
                break;
            case 14:
                salaryCoefficient = 0;
                break;
            default:
                salaryCoefficient = 1.5;
        }
        return salaryCoefficient;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salaryRequest = sc.nextInt();
        if (salaryRequest <= 300 || salaryRequest >= 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            for (int i = 0; i <= 14; i++) {
                double actualSalary = TaskC1.monthSalaryCoefficient(i)*salaryRequest;
                if (actualSalary == 666){
                    System.out.println("За " + TaskC1.monthName(i) + " начислено $" + actualSalary);
                break;}
                else
                    System.out.println("За " + TaskC1.monthName(i) + " начислено $" + actualSalary);
            }
        }
    }
}
