package by.it.Yrkevich.lesson03;

/*
Lesson 03. Конвертер температуры

Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.

Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9

Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.

Пример вывода:
104.0


Требования:
1. Метод convertCelsiumToFahrenheit(int) должен быть не приватным и статическим.
2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия
в градусы Фаренгейта и возвращать это число.*/


import java.util.Scanner;

class TaskC1 {

        public static double convertCelsiumToFahrenheit(int a) {

            double convertCelsiumToFahrenheit = a * 9 / 5 + 32;
            return convertCelsiumToFahrenheit;
        }

        public static void main(String[] args) {
            Scanner weight = new Scanner(System.in);
            int a = weight.nextInt();
            double c= convertCelsiumToFahrenheit (a);
            System.out.println(c);
        }

    }
