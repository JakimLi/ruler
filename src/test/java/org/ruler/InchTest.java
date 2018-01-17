package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InchTest {

    @Test
    public void three_inch_should_equals_three_inch() throws Exception {
        assertEquals(new Inch(3), new Inch(3));
    }

    @Test
    public void three_inch_should_not_equal_to_four_inch() throws Exception {
        assertNotEquals(new Inch(3), new Inch(4));
        assertNotEquals(new Inch(3), new Inch(2));
    }

    @Test
    public void three_inch_not_equal_to_null() throws Exception {
        assertNotEquals(new Inch(3), null);
    }

    @Test
    public void null_not_equal_to_three_inch() throws Exception {
        assertNotEquals(null, new Inch(3));
    }
}
