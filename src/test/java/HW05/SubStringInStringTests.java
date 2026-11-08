package HW05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class SubStringInStringTests {

    SubStringInString ssis;

    @BeforeEach
    public void setUp() {
        ssis = new SubStringInString();
    }

    @AfterEach
    public void tearDown() {
        ssis = null;
    }

    @Test
    public void subStringInStringTest() {
        //given
        String text = "abcaabbcabbcc", pattern = "abb";
        int expected = 2;

        //when
        int actual = ssis.subStringInString(text, pattern);

        //then
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> subStringInStringTestWithParameters() {
        return Stream.of(
                Arguments.of("aaaaaa", "a", 6),
                Arguments.of("abcbcabcaabc", "abc", 3),
                Arguments.of("aaababaabaaaabaabaabaabaaababaabaaababaabaaaab" +
                        "aabaabaabbabaabaaababaababaabaabaabaaabbaab", "aab", 22)
        );
    }

    @ParameterizedTest
    @MethodSource("subStringInStringTestWithParameters")

    public void subStringInStringTestWithParameters(String text, String pattern, int expected) {
        //when
        int actual = ssis.subStringInString(text, pattern);

        //then
        Assertions.assertEquals(expected, actual);
    }
}