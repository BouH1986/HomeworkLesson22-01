package AlgHW03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergesTests {

    @Test
    public void mergeTest() {
        //given
        int[] a = {10, 7, 3, 1}, b = {8, 6, 4, 2};
        int[] expected = {10, 8, 7, 6};

        //when
        int[] actual = Merges.merge(a, b);

        //then
        Assertions.assertArrayEquals(expected, actual);
    }
}