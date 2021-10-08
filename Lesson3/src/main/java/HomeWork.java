import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    private static int getRandomInteger(int bound) {
        Random RANDOM = new Random();
        return RANDOM.nextInt(bound);
    }

    public static void main(String[] args) {
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();
        int[] array = new int[userNumber];

        for (int i = 0, len = array.length; i < len; i++) {
            array[i] = getRandomInteger(50);
        }

        System.out.println(Arrays.toString(array));
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number == 0) {
            return 10;
        }

        return number > 0 ? number + 1 : number - 2;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int oddCount = 0;

        for (int anInt : ints) {
            if (anInt % 2 != 0) {
                oddCount += 1;
            }
        }

        return oddCount;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        int lastDigit = count % 10;
        int lastTwoDigits = count % 100;
        String endOfWord = "ов";

        if (lastTwoDigits == 11) {
            endOfWord = "ов";
        } else if (lastDigit == 1) {
            endOfWord = "";
        } else if (lastDigit > 1 && lastDigit < 5) {
            endOfWord = "а";
        }

        System.out.printf("%s программист%s%n", count, endOfWord);
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        String finalResult = "";
        if (number % 3 == 0) {
            finalResult += "foo";
        }

        if (number % 5 == 0) {
            finalResult += "bar";
        }

        System.out.println(finalResult);
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        int[][] doubleArray = {
                {getRandomInteger(100), getRandomInteger(100), getRandomInteger(100)},
                {getRandomInteger(100), getRandomInteger(100), getRandomInteger(100)},
                {getRandomInteger(100), getRandomInteger(100), getRandomInteger(100)},
        };
        int sum = 0;

        for (int i = 0; i < doubleArray.length; i++) {
            sum += doubleArray[i][i];
        }

        System.out.println(sum);
    }

    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);

        int userFirstNumber = scanner.nextInt();
        int userSecondNumber = scanner.nextInt();

        int[][] array = new int[userFirstNumber][userSecondNumber];

        for (int[] innerArray : array) {
            for (int j = 0; j < innerArray.length; j++) {
                innerArray[j] = getRandomInteger(100);
            }
        }

        String value = "*";
        for (int[] innerArray : array) {
            for (int k : innerArray) {

                if (k % 3 == 0) {
                    value = "+";
                } else if (k % 7 == 0) {
                    value = "-";
                }

                System.out.print(value);
            }
            System.out.println();
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        for (int i = 1; i < 1000; i++) {
            boolean isPrime = i != 1;

            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
