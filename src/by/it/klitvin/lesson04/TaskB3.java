package by.it.klitvin.lesson04;
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
    public static void main(String[] args) {

    System.out.println("Ввод:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int sum = 0;
        int b = 0;
int c = 0;
        while (a>sum)
        {sum=b+c;
            System.out.print(sum + ",");

            b++;
             c++;

    }
    }
}
