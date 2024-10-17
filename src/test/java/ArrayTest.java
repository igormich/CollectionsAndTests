import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    void defaultZeros() {
        int[] array = new int[3];
        Assertions.assertEquals(array[0], 0);
    }

    @Test
    void init() {
        int[] array = new int[]{1, 2, 3};
        Assertions.assertEquals(array[0], 1);
        Assertions.assertEquals(array[1], 2);
        Assertions.assertEquals(array[2], 3);
    }

    @Test
    void outOfRangeException() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int[] array = new int[]{1, 2, 3};
            int i = array[3];
            System.out.println(i);//Will be not executed
        });
    }

}
