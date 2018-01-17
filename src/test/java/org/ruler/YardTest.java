package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.ruler.Length.yard;

public class YardTest {

    @Test
    public void three_yard_should_equals_three_yard() throws Exception {
        assertEquals(yard(3), yard(3));
    }

    @Test
    public void three_yard_should_not_equal_to_four_yard() throws Exception {
        assertNotEquals(yard(3), yard(4));
        assertNotEquals(yard(3), yard(2));
    }

    @Test
    public void three_yard_not_equal_to_null() throws Exception {
        assertNotEquals(yard(3), null);
    }

    @Test
    public void null_not_equal_to_three_yard() throws Exception {
        assertNotEquals(null, yard(3));
    }
}
