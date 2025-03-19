package Task15;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
