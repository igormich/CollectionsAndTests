import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    @Test
    void simpleOperations() {
        Set<String> set = new HashSet<>();
        set.add("Abc");
        set.add("Bcd");
        set.add("Cde");
        Assertions.assertEquals(set.size(), 3);
        set.add("Bcd");
        Assertions.assertEquals(set.size(), 3);
        set.remove("Bcd");
        Assertions.assertEquals(set.size(), 2);
    }

    @Test
    void linkedHashSetSaveAddOrder() {
        Set<String> set = new LinkedHashSet<>();
        set.add("Abc");
        set.add("Cde");
        set.add("Bcd");
        var iterator = set.iterator();
        Assertions.assertEquals(iterator.next(), "Abc");
        Assertions.assertEquals(iterator.next(), "Cde");
        Assertions.assertEquals(iterator.next(), "Bcd");
    }

    @Test
    void linkedHashSetSortWithNaturalOrder() {
        Set<String> set = new TreeSet<>();
        set.add("Abc");
        set.add("Cde");
        set.add("Bcd");
        var iterator = set.iterator();
        Assertions.assertEquals(iterator.next(), "Abc");
        Assertions.assertEquals(iterator.next(), "Bcd");
        Assertions.assertEquals(iterator.next(), "Cde");
    }
}
