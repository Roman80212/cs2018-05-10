package by.it.lepchenkov.lesson03;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    static int sumDigitsInNumber(int x){
        int x1=x/1000;
        int x2=(x- x1*1000)/100;
        int x3=(x-x1*1000-x2*100)/10;
        int x4=x-x1*1000-x2*100 - x3*10;
        return x1+x2+x3+x4;

    }
    
    public static void main(String[] args) {
        System.out.println(TaskC2.sumDigitsInNumber(5467));
    }

}
