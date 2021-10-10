import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println(getAmebas());
        multiple(2, 3);
        printMConvertedMatrix();
        printArrayOfOdds();
        printMaxItemInArray();
        printArrayOfRandoms();
        findAndChangePlaceForMaxItemInArray(new int[] {1, 3, 200, 23});
        findDoubles(new int[] {1, 2 ,3});
        rearrangeMatrix();
    }

    public static int getAmebas() {
        return (int) Math.pow(2, 24/3);
    }

    public static int multiple(int a, int b) {
        if (a < 0 && b < 0) {
            a = Math.abs(a);
            b = Math.abs(b);
        }

        int result = 0;

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return result;
    }

    public static String getLine(int starsQuantity, int spacesQuantity) {
        String starSymbol = "*";
        String spaceSymbol = " ";
        String stars = starSymbol.repeat(starsQuantity);
        String spaces = spaceSymbol.repeat(spacesQuantity);

        if (spacesQuantity == 0) {
            return stars;
        }

        return spaces + stars;
    }

    public static void printMConvertedMatrix() {
        int[][] array = new int[4][4];

        for (int i = 1; i <= array.length; i++) {
            System.out.println(getLine(i, array.length - i));
        }

        for (int i = 1; i <= array.length; i++) {
            System.out.println(getLine(i, 0));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(getLine(array.length - i, i));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(getLine(array.length - i, 0));
        }
    }

    public static void printNumberInfo() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == 0) {
            return;
        }

        int number = userNumber;
        String s = "положительное число";
        int digits = 0;

        if (userNumber < 0) {
            s = "отрицательное число";
        }

        while (number != 0) {
            number = number / 10;
            digits++;
        }

        System.out.printf("%d - это %s, количество цифр - %d", userNumber, s, digits);
    }

    public static void printArrayOfOdds() {
        int[] array = new int[50];
        int counter = 1;

        for (int i = 0; i < 50; i++) {
            array[i] = counter;
            counter += 2;
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    public static int[] findMaxItemAndItsIndex(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
                maxValueIndex = i;
            }
        }

        return new int[]{maxValue, maxValueIndex};
    }

    public static void printMaxItemInArray() {
        int[] array = new int[12];
        Random random = new Random();
        Arrays.setAll(array, x -> random.nextInt(100));
        int[] foundValues = findMaxItemAndItsIndex(array);

        System.out.printf("Max value: %d, its index: %d", foundValues[0], foundValues[1]);
    }

    public static void printArrayOfRandoms() {
        int[] array = new int[20];
        Random random = new Random();
        Arrays.setAll(array, x -> random.nextInt(20));

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));
    }

    public static int[] findAndChangePlaceForMaxItemInArray(int[] array) {
        int[] foundValues = findMaxItemAndItsIndex(array);

        int firstNumber = array[0];
        array[0] = foundValues[0];
        array[foundValues[1]] = firstNumber;

        return array;
    }

    public static String findDoubles(int[] array) {
        String duplicates = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (duplicates.length() == 0) {
                        duplicates += array[i];
                    } else {
                        duplicates += ", " + array[i];
                    }
                }
            }
        }

        if (duplicates.length() == 0) {
            return "There is no duplicates";
        }

        return "There are following duplicates " + duplicates;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rearrangeMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userNumber = scanner.nextInt();
        int[][] array = new int[userNumber][userNumber];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        printMatrix(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= j) {
                    continue;
                }
                int a = array[i][j];
                int b = array[j][i];
                array[i][j] = b;
                array[j][i] = a;
            }
        }

        printMatrix(array);
    }
}