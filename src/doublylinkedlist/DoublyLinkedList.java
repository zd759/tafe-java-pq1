/* Name: Zara Duncanson
 * Student ID: P229768
 * Date: 06/02/20
 * Task: Portfolio Q1
 * This program stores countries in a doubly linked list. Objects are created
 * and stored in the list which also stores cities inside these countries using
 * a nested class within the 'Country' class. Also has a sort method.
 */
package doublylinkedlist;

import java.util.*;

public class DoublyLinkedList {

    public static void main(String[] args) {
        //initialise the linked list and objects
        LinkedList<Country> countries = new LinkedList<>();
        Country c1 = new Country("Brazil", "Rio");
        Country c2 = new Country("Brazil", "San Paulo");
        Country c3 = new Country("Australia", "Perth");
        Country c4 = new Country("Australia", "Sydney");
        Country c5 = new Country("Japan", "Tokyo");
        Country c6 = new Country("Spain", "Madrid");

        //add to linked list
        countries.add(c1);
        countries.add(c2);
        countries.addLast(c3);
        countries.addLast(c4);
        countries.addFirst(c5);
        countries.addFirst(c6);
        //print cities BEFORE SORT
        System.out.println("\nPrint LinkedList in Order added:");
        for (Country x : countries) {
            System.out.println(x.getCity() + ", " + x.getCountryName());
        }

        //sort by city name using Comparator
        countries.sort(Country.compareCity);

        //print cities and countries after sort BY CITY
        System.out.println("\nSort by City name:");
        for (Country x : countries) {
            System.out.println(x.getCity() + ", " + x.getCountryName());
        }

        //sort by country
        countries.sort(Country.compareCountry);
        //print cities and countries after sort BY COUNTRY
        System.out.println("\nSort by Country name:");
        for (Country x : countries) {
            System.out.println(x.getCity() + ", " + x.getCountryName());
        }
    }
}
