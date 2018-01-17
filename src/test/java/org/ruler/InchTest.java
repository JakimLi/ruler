package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.ruler.Length.inch;

public class InchTest {

    @Test
    public void three_inch_should_equals_three_inch() throws Exception {
        assertEquals(inch(3), inch(3));
    }

    @Test
    public void three_inch_should_not_equal_to_four_inch() throws Exception {
        assertNotEquals(inch(3), inch(4));
        assertNotEquals(inch(3), inch(2));
    }

    @Test
    public void three_inch_not_equal_to_null() throws Exception {
        assertNotEquals(inch(3), null);
    }

    @Test
    public void null_not_equal_to_three_inch() throws Exception {
        assertNotEquals(null, inch(3));
    }
}
