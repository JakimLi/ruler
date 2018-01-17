package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.ruler.Length.mile;

public class MileTest {

    @Test
    public void three_mile_should_equals_three_mile() throws Exception {
        assertEquals(mile(3), mile(3));
    }

    @Test
    public void three_mile_should_not_equal_to_four_mile() throws Exception {
        assertNotEquals(mile(3), mile(4));
        assertNotEquals(mile(3), mile(2));
    }

    @Test
    public void three_mile_not_equal_to_null() throws Exception {
        assertNotEquals(mile(3), null);
    }

    @Test
    public void null_not_equal_to_three_mile() throws Exception {
        assertNotEquals(null, mile(3));
    }
}
