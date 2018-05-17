package by.it.lepchenkov.lesson03;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/

import java.util.Scanner;

class TaskB2 {
    static double dis(int a, int b, int c) {
        return b * b - (4 * a * c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double answer1, answer2;
        double result = TaskB2.dis(x, y, z);
        if (result < 0) System.out.println("Отрицательный дискриминант");
        if (result == 0) {
            answer1 = -y/(2*x);
            System.out.println(answer1);
        }
        if (result > 0) {
            answer1 = (-y+result)/(2*x);
            answer2 = (-y-result)/(2*x);
            System.out.println(answer1+" "+answer2);
        }


    }
}
