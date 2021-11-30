package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op() {
        assertEquals(7, new Sample().op(Sample.Operation.ADD, 3, 4));
        assertEquals(12, new Sample().op(Sample.Operation.MULT, 3, 4));
    }

    @Test
    void fact() {
        assertEquals(6, new Sample().fact(3));
        assertEquals(720, new Sample().fact(6));
    }

}
