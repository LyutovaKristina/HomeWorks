package ru.qaway.testng;

public class Triangle {

    public static final String TRIANGLE = "TRIANGLE";
    public static final String EQUILATERAL = "EQUILATERAL";
    public static final String ISOSCELES = "ISOSCELES";
    public static final String NOT_TRIANGLE = "NOT_TRIANGLE";

    /**
     * Метод проверяет, является ли входная строка треугольником и определяет его тип.
     *
     * @param input Строка с тремя числами (например, "4 5 6")
     * @return Тип треугольника или сообщение о невозможности треугольника
     */


    public static String isTriangle(String input) {
        // Разбиваем входную строку на массив строк
        String[] sides = input.trim().split(" ");

        // Проверяем, что введено ровно три стороны
        if (sides.length != 3) {
            return NOT_TRIANGLE;
        }

        try {
            // Преобразуем строки в числа
            int a = Integer.parseInt(sides[0]);
            int b = Integer.parseInt(sides[1]);
            int c = Integer.parseInt(sides[2]);

            // Проверяем, что все стороны положительные
            if (a <= 0 || b <= 0 || c <= 0) {
                return NOT_TRIANGLE;
            }

            // Проверяем неравенство треугольника
            if (!(a + b > c && a + c > b && b + c > a)) {
                return NOT_TRIANGLE;
            }

            // Определяем тип треугольника
            if (a == b && b == c) {
                return EQUILATERAL; // Равносторонний треугольник
            } else if (a == b || b == c || a == c) {
                return ISOSCELES; // Равнобедренный треугольник
            } else {
                return TRIANGLE; // Обычный треугольник
            }
        } catch (NumberFormatException e) {
            // Если входные данные не являются числами, возвращаем NOT_TRIANGLE
            return NOT_TRIANGLE;
        }
    }
}