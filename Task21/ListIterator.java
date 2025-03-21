package Task21;

import java.util.*;

public class ListIterator {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Bhopal");
        cities.add("Indore");
        cities.add("Jharkhand");
        cities.add("Bihar");
        cities.add("Pune");
        cities.add("Kodarma");

        System.out.println("Cities in forward order:");
        ListIterator<String> listIterator = cities.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nCities in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
