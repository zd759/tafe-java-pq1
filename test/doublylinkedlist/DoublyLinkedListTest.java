package doublylinkedlist;

import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Test class for Doubly Linked List main class
 *
 * @author P229768
 */
public class DoublyLinkedListTest {

    LinkedList<Country> test = new LinkedList<>();

    @Test
    public void DoublyLinkedListTest() {
        assertTrue(test.isEmpty()); //test if linked list is empty
        assertEquals(0, test.size()); //size of linked list should be 0
    }

    @Test
    public void testAdd() {
        Country t1 = new Country("country", "city"); //add object
        test.add(t1);
        assertFalse(test.isEmpty()); //not empty
        assertEquals(1, test.size()); //size 1
    }

    @Test
    public void testStrings() {
        Country t2 = new Country("Sweden", "Stockholm"); //add object
        test.addLast(t2);
        String cityOutput = test.getLast().getCity(); //convert to string for test
        assertThat(cityOutput, is("Stockholm")); //test the last city in the list is this string
        String countryOutput = test.get(0).getCountryName();
        assertThat(countryOutput, is("Sweden"));
    }

    @Test
    public void testSortCity() {
        Country t3 = new Country("a", "1"); //add objects
        Country t4 = new Country("b", "2");
        Country t5 = new Country("c", "3");
        test.add(t3);
        test.add(t4);
        test.add(t5);
        test.sort(Country.compareCity); //sort the list
        String output = (test.getFirst().getCountryName() + " "
                + test.get(1).getCountryName() + " "
                + test.getLast().getCountryName()); //get the string
        assertThat(output, is("a b c")); //test extected output is sorted
    }
}
