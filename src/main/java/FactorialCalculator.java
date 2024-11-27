import java.util.Scanner;

public class FactorialCalculator {

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

    }

    public int subtract(int i, int i1) {
    }

    public int add(int i, int i1) {
    }

    public int multiply(int i, int i1) {
    }

    public void divide(int i, int i1) {
    }
}
