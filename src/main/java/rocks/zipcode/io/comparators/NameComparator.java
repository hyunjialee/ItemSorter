package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        // if statements
        // compares each the letters


        return item1.getName().compareToIgnoreCase(item2.getName());
    }
}
