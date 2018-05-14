package by.it.stebletsky.taining;

public class D1 {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int arg) {
        System.out.print(" " + arg);
        if (arg<7) {
            f(arg+1);
        }
        System.out.println(" " + arg);
    }

}
