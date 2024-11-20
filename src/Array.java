class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}


class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}


class ArrayHandler {
    public void processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }


        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    total += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования элемента [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        System.out.println("Сумма элементов: " + total);
    }
}


public class Array {
    public static void main(String[] args) {
        ArrayHandler handler = new ArrayHandler();


        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };


        String[][] invalidDataArray = {
                {"1", "2", "3", "a"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        try {
            System.out.println("Обработка корректного массива:");
            handler.processArray(validArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }


        try {
            System.out.println("Обработка некорректного массива (размер):");
            handler.processArray(invalidSizeArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }


        try {
            System.out.println("Обработка некорректного массива (данные):");
            handler.processArray(invalidDataArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
