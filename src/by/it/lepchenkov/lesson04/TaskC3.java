package by.it.lepchenkov.lesson04;

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
    static String numberName(int x) {
        String numberN;
        switch (x) {
            case 1:
                numberN = "один";
                break;
            case 2:
                numberN = "два";
                break;
            case 3:
                numberN = "три";
                break;
            case 4:
                numberN = "четыре";
                break;
            case 5:
                numberN = "пять";
                break;
            case 6:
                numberN = "шесть";
                break;
            case 7:
                numberN = "семь";
                break;
            case 8:
                numberN = "восемь";
                break;
            case 9:
                numberN = "девять";
                break;
            case 10:
                numberN = "десять";
                break;
            case 11:
                numberN = "одиннадцать";
                break;
            case 12:
                numberN = "двенадцать";
                break;
            case 13:
                numberN = "триннадцать";
                break;
            case 14:
                numberN = "четырнадцать";
                break;
            case 15:
                numberN = "пятадцать";
                break;
            case 16:
                numberN = "шестнадцать";
                break;
            case 17:
                numberN = "семнадцать";
                break;
            case 18:
                numberN = "восемнадцать";
                break;
            case 19:
                numberN = "девятнадцать";
            case 20:
                numberN = "девятнадцать";
            case 30:
                numberN = "девятнадцать";
            case 40:
                numberN = "девятнадцать";
            case 50:
                numberN = "девятнадцать";
            case 60:
                numberN = "девятнадцать";
            case 70:
                numberN = "девятнадцать";
            case 80:
                numberN = "девятнадцать";
            case 90:
                numberN = "девятнадцать";
            case 100:
                numberN = "девятнадцать";
                break;
            default:
                numberN = "такого вариант нет";
        }
        return numberN;
    }

    public static void main(String[] args) {
        int size = 10;
        int j = 2;
        while (j <= size) {
            int i = 2;
            while (i <= size) {
                System.out.println(TaskC3.numberName(j) + " умножить на " + TaskC3.numberName(i) + " равно "+ j*i);
                i++;
            }
            j++;
        }
    }

}
