package by.it.bukovp.lesson03;
import java.util.Scanner;
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
class TaskB2 {
    public static void main(String[] args) {
        double diskr;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        diskr = b*b -4*a*c;
        if (diskr > 0) {
            System.out.println("Вывод:");
            double k1 = (-b + Math.sqrt(diskr)) / (2*a);
            double k2 = (-b - Math.sqrt(diskr)) / (2*a);
            System.out.println(k1 + " " +k2);
        }
        else if (diskr == 0) {
            System.out.println("Вывод:");
            double k3 = -b / (2*a);
            System.out.println(k3);
        }
        else {
            System.out.println("Вывод:");
            System.out.println("Отрицательный дискриминант");
        }

    }
}
