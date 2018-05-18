package by.it.dariadzel.lesson04;
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
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        int i;
        int sum = 0;

        for (i = 0; i < 1000; i++) {
            sum += i;
            if (sum == 0) {
                System.out.print("");

            } else {

                if (sum > a) break;
                System.out.print(sum + ",");
            }


        }


    }
}

  /*  while (sum < a) {
            int i = 1;
            sum += i;
            System.out.print(sum + ",");
            ++i;


       /* for ( int i = 0; i > 10 ; i ++){

            int sum = i + i++;
            System.out.print(sum + ",");
           // i++;
            //if(sum >= a) break;*/

