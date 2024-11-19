public class Main {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        isSum();
        number();
        number7();
        printNum();
        leapYear();
        arrayOfNum10();
        arrayOfNum11();
        arrayOfNum12();
        arrayOfMum13();
        arrayOfNum14();
    }

    public static void printTreeWords() {
        System.out.println("Задание 1");
        System.out.println("Orange\nBanana\nApple");
    }


    public static void checkSumSign() {
        System.out.println("Задание 2");
        int a = -200, b = 150, c = a + b;
        if (c > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println("Задание 3");
        int value = 20;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("Задание 4");
        int a = 12, b = 155;
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }

    public static void isSum() {
        System.out.println("Задание 5");
        System.out.println(isSumInRange(41, 5));
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void number() {
        System.out.println("Задание 6");
        int a = 10;
        {
            if (a >= 0)
                System.out.println("Положительное");
            else
                System.out.println("Отрицательное");
        }
    }

    public static void number7() {
        System.out.println("Задание 7");
        System.out.println(isNegative(-5));
        System.out.println(isNegative(0));
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printNum() {
        System.out.println("Задание 8");
        int a = 5;
        String b = "Hello, World!";
        System.out.println(b.repeat(a));
    }

    public static void leapYear() {
        System.out.println("Задание 9");
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2000));
    }

    public static void arrayOfNum10() {
        System.out.println("Задание 10");
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                myArray[i] = 0;
            } else if (myArray[i] == 0) {
                myArray[i] = 1;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void arrayOfNum11() {
        System.out.println("Задание 11");
        int[] myArray = new int[101];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void arrayOfNum12() {
        System.out.println("Задание 12");
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 6) {
                myArray[i] = myArray[i] * 2;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void arrayOfMum13() {
        System.out.println("Задание 13");
        int size = 5;
        int[][] myArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            myArray[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayOfNum14() {
        System.out.println("Задание 14");
        int[] resultArray = createArray(5, 3);
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
