package by.it.lepchenkov.lesson04;
/*
С клавиатуры вводится некоторое число.
Пусть считается сумма int sum=1+2+3+4+5+... и т.д.
Каждая цифра суммы выводится в консоль через запятую (без пробела).
Остановите вывод до того, как сумма превысит введенное число.

Например:
Ввод:
122
Вывод:
1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,

Ввод:
15
Вывод:
1,3,6,10,15,

Ввод:
14
Вывод:
1,3,6,10,


 */


import java.util.Scanner;

public class TaskB3 {
    static int sumNumberSequence(int x) {
        int i = 1;
        int sum = 0;
        while (i <= x) {
            sum = i + sum;
            i++;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int j = 1;
        while (TaskB3.sumNumberSequence(j) <= number) {
            System.out.print(TaskB3.sumNumberSequence(j) + ",");
            j++;
        }
    }
}


