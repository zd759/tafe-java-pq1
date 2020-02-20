/*
 * This class contains a nested class 'city' with assessor methods for 'city'
 */
package doublylinkedlist;

/**
 *
 * @author Zara
 */
import java.util.Comparator;

public class Country {
//attributes of country class

    private String countryName;
    private City c;

//default
    public Country() {
    }

    //overload constructor
    public Country(String countryName, String city) {
        this.countryName = countryName;
        //creating a city object in private class
        c = new City(city);
    }

    public String getCountryName() {
        return countryName;
    }

    //get city name from private class
    public String getCity() {
        return c.getCity();
    }

//private class city nested within public class country for better encapsulation
// and organisation
    private class City {

        //attribute of city class
        private String city;

        public City(String city) {
            this.city = city;
        }

        /**
         * @return the city
         */
        public String getCity() {
            return city;
        }

        /**
         * @param city the city to set
         */
        public void setCity(String city) {
            this.city = city;
        }
    }
    //compares city name for sort
    public static Comparator<Country> compareCity = new Comparator<Country>() {
        @Override
        public int compare(Country one, Country two) {
            return (int) (one.getCity().compareTo(two.getCity()));
        }
    };
    //compares country name for sort
    public static Comparator<Country> compareCountry = new Comparator<Country>() {
        @Override
        public int compare(Country one, Country two) {
            return (int) (one.getCountryName().compareTo(two.getCountryName()));
        }
    };

    //print method
    //public void printCities() {
    //    System.out.println("Country:\t" + countryName + "\nCity: \t\t" + c.getCity());
    //}
}
