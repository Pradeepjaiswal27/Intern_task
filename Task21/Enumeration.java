package Task21;

import java.util.Vector;
import java.util.Enumeration;

public class Enumeration{
    public static void main(String[] args) {

        Vector<String> countries = new Vector<>();
        countries.add("India");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("France");
        countries.add("Australia");

        System.out.println("Country names:");
        Enumeration<String> enumeration = countries.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
