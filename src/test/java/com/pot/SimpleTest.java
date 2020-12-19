package com.pot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTest {
    private Simple simple = new Simple();

    @Test
    void printTest() {
        assertEquals(simple.print(), "Travis is best CI system!");
    }
}