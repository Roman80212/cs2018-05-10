package by.it.stebletsky.training;

import java.util.Scanner;

public class m20 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter numbers of Array: ");
        int n = in.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter a[" + i + "] =");
            a[i] = in.nextInt();

        }


    }

}


