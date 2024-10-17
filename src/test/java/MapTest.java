import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {


    @Test
    void simpleOperations() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Abc", 1);
        map.put("Cde", 2);
        map.put("Bcd", 3);
        Assertions.assertEquals(map.size(), 3);
        Assertions.assertEquals(map.get("Bcd"), 3);
        map.put("Bcd", 4);
        Assertions.assertEquals(map.size(), 3);
        Assertions.assertEquals(map.get("Bcd"), 4);
    }
}
