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

        String x = item1.getName();
        String y = item2.getName();

        for (int i = 0; i < Math.min(x.length(), y.length()); i++) {
            int name1 = x.charAt(i);
            int name2 = y.charAt(i);

            if (name1 != name2) {
                return Integer.compare(name1, name2);
            }
        }
        return 0;
    }
}
