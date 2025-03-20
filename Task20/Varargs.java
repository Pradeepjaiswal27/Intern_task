package Basic.Task20;

public class Varargs {
    public static int calculateAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required to calculate an average.");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(10, 20, 30));
        System.out.println(calculateAverage(15, 25, 35, 45));
        System.out.println(calculateAverage(100));
    }
}
