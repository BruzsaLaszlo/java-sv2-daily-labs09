package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    @Test
    void shortestWords() {

        List<String> words = List.of("aaa", "aa", "bb", "cccc", "dd");
        StringList sl = new StringList();
        List<String> actual = sl.shortestWords(words);

        assertEquals(3, actual.size());
        assertTrue(actual.contains("dd"));

    }
}