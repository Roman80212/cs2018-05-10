package by.it.stebletsky.taining;

import java.util.Scanner;

public class T1m16 {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("введите второе чило:");
        int b = sc.nextInt();
        System.out.println("Остаток от деления:" + a%b);

    }
}
