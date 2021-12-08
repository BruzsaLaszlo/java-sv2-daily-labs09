package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserTest {

    @Test
    void enrypts() {

        String text = "This is a secret text";
        Ceaser ceaser = new Ceaser(39);

        String actual = ceaser.enrypts(ceaser.enrypts(text));
        assertEquals(text.toLowerCase(), actual);

    }
}