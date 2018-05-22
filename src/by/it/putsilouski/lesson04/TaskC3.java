package by.it.putsilouski.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static String digitaltostring(int n) {
        String St;
        if (n <= 19) {
            switch (n) {
                case 0:
                    return "ноль";
                case 1:
                    return "один";
                case 2:
                    return "два";
                case 3:
                    return "три";
                case 4:
                    return "четыре";
                case 5:
                    return "пять";
                case 6:
                    return "шесть";
                case 7:
                    return "семь";
                case 8:
                    return "восемь";
                case 9:
                    return "девять";
                case 10:
                    return "десять";
                case 11:
                    return "одиннадцать";
                case 12:
                    return "двенадцать";
                case 13:
                    return "тринадцать";
                case 14:
                    return "четырнадцать";
                case 15:
                    return "пятнадцать";
                case 16:
                    return "шестнадцать";
                case 17:
                    return "семьнадцать";
                case 18:
                    return "восемнадцать";
                case 19:
                    return "девятнадцать";
            }
        }
        if ((n % 10 == 0) && (n > 19)) {
            switch (n) {
                case 20:
                    return "двадцать";
                case 30:
                    return "тридцать";
                case 40:
                    return "сорок";
                case 50:
                    return "пятьдесят";
                case 60:
                    return "шестьдесят";
                case 70:
                    return "семьдесят";
                case 80:
                    return "восемьдесят";
                case 90:
                    return "девяносто";
                case 100:
                    return "сто";
            }
        }
        int ost = (n % 10);
        int des = n - ost;
        St = digitaltostring(des) + " " + digitaltostring(ost);
        return St;
    }
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
//        int i = 6;
//        int j = 4;
                int ot = j * i;
                String si = digitaltostring(i);
                String sj = digitaltostring(j);
                String otv = digitaltostring(ot);
                System.out.println(si + " умножить на " + sj + " равно " + otv);
            }
        }
    }
}
