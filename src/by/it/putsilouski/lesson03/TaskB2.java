package by.it.putsilouski.lesson03;
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
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            double discr = dis(a,b,c);
//            System.out.println(discr); //проверка дискриминанта
            if (discr>0){
              double r1 = (-b - discr)/(2*a);
              double r2 = (-b + discr)/(2*a);
              System.out.print(r1+ " ");
              System.out.print(r2);
            }
            if (discr==0){
                double r1 = (-b)/(2*a);
                System.out.print(r1+"\n");
            }
            if (discr<0){
                System.out.print("Отрицательный дискриминант");
            }
    }

    public static double dis (int a, int b, int c) {
        double discr = (b*b)-(4*a*c);
         return (discr);
    }

}
