package Basic.Task15;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        generateFibonacci(n);
        scanner.close();
    }

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
