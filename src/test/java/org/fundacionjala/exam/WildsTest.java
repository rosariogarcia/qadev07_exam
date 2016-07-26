package org.fundacionjala.exam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link SearchEngine}
 */
public class WildsTest {
    String haystack = "Once upon a midnight dreary, while I pondered, weak and weary";

    @Test
    public void normalSearchTest() {
        assertEquals(0, SearchEngine.find("Once", haystack));
        assertEquals(12, SearchEngine.find("midnight", haystack));
        assertEquals(-1, SearchEngine.find("codewars", haystack));
    }

    @Test
    public void wildSearchTest() {
        assertEquals(5, SearchEngine.find("_po_", haystack));
        assertEquals(12, SearchEngine.find("___night", haystack));
    }
}
