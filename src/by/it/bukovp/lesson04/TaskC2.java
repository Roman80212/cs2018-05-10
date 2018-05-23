package by.it.bukovp.lesson04;

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
        System.out.println("Введите день 2018 года: ");
        int day = scan.nextInt();
        if (day < 1 || day > 31){
            System.out.println("Вы ввели неправильный день. День должен быть в диапазоне от 1 до 31!");
        }
        System.out.println("Введите месяц 2018 года: ");
        int month = scan.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Вы ввели неправильный месяц. Нужно ввести месяц в диапазоне от 1 до 12");
        }
        switch (month) {
            case 1:{
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day);
                break;
            }
            case 2: {
                if (day > 28){
                    System.out.println("В феврале 2018 года 28 дней!");
                    break;
                }
                int day2 = day+31;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day2);
                break;
            }
            case 3: {
                int day3 = day+31+28;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day3);
                break;
            }
            case 4: {
                if (day > 30){
                    System.out.println("В апреле 2018 года 30 дней!");
                    break;
                }
                int day4 = day+31+28+31;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day4);
                break;
            }
            case 5: {
                int day5 = day+31+28+31+30;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day5);
                break;
            }
            case 6: {
                if (day > 30){
                    System.out.println("В июне 2018 года 30 дней!");
                    break;
                }
                int day6 = day+31+28+31+30+31;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day6);
                break;
            }
            case 7: {
                int day7 = day+31+28+31+30+31+30;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day7);
                break;
            }
            case 8: {
                int day8 = day+31+28+31+30+31+30+31;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day8);
                break;
            }
            case 9: {
                if (day > 30){
                    System.out.println("В сентябре 2018 года 30 дней!");
                    System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                    break;
                }
                int day9 = day+31+28+31+30+31+30+31+31;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day9);
                break;
            }
            case 10: {
                int day10 = day+31+28+31+30+31+30+31+31+30;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day10);
                break;
            }
            case 11: {
                if (day > 30){
                    System.out.println("В ноябре 2018 года 30 дней!");
                    break;
                }
                int day11 = day+31+28+31+30+31+30+31+31+30+31;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day11);
                break;
            }
            case 12: {
                int day12 = day+31+28+31+30+31+30+31+31+30+31+30;
                System.out.println("Количество дней от начала 2018 года до текущей даты равно: ");
                System.out.println(day12);
                break;
            }
        }
    }
}
