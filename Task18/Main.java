/*Create an anonymous class that extends Rectangle and provides the implementation for the calculateArea() method. */
package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rc = (h, w) -> h * w; // lemda expraction
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hight");
        int hight = sc.nextInt();
        System.out.println("Enter the width");
        int width = sc.nextInt();

        int area = rc.calculateArea(hight, width);
        System.out.println("total area is: " + area);
    }
}
