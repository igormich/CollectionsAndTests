import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ListTest {

    @Test
    void simpleOperations() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Assertions.assertEquals(list.size(), 3);
        list.remove("3");
        Assertions.assertEquals(list.size(), 2);
        list.remove(0);
        Assertions.assertEquals(list.size(), 1);
        Assertions.assertTrue(list.contains("2"));
    }

    @Test
    void concurrentModificationException() {
        Assertions.assertThrows(ConcurrentModificationException.class, () -> {
            List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
            for (var element : list) {
                if (element % 2 == 0) {
                    list.remove(element);
                }
            }
        });
    }

    @Test
    void removeElements() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        list.removeIf(e -> e % 2 == 0);
        Assertions.assertFalse(list.contains(2));
        Assertions.assertFalse(list.contains(4));

        Assertions.assertTrue(list.contains(1));
        Assertions.assertTrue(list.contains(3));
        Assertions.assertTrue(list.contains(5));
    }

    @Test
    void stream() {
        var list = List.of(1, 2, 3, 4, 5)
                .stream()
                .map(e -> e * e)
                .filter(e -> e % 2 == 0)
                .toList();
        Assertions.assertTrue(list.contains(4));
        Assertions.assertTrue(list.contains(16));
    }
}
