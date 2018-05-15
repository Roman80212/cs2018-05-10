package by.it._tasks_.bukovp.lesson02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) throws IOException {
        int i = 0; int j =0; int sum = 0;
        int number = 2;
        System.out.println("Ввод: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (j<number) {
            i = Integer.parseInt(reader.readLine());
            sum += i;
            j++;
        }
        System.out.println("Sum = " + sum);
    }
}

