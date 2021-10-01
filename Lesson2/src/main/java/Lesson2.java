import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3,4));
    }

    public static int sum(int a, int b) {
        int result = a + b;
        // просто больше никогда не получится, т.к. при сложении получается переполнение
        return result >= Integer.MAX_VALUE ? 1 : result;
    }

    public static double max(int a, int b) {
        return Math.max(a, b);
    }

    public static double average(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static int max(int[] array) {
        return Arrays.stream(array).max().orElse(0);
    }

    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
