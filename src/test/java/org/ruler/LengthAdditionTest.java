package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.ruler.Length.feet;
import static org.ruler.Length.inch;
import static org.ruler.Length.mile;

public class LengthAdditionTest {

    @Test
    public void one_mile_plus_one_mile_equals_to_2_mile() throws Exception {
        assertEquals(mile(1).plus(mile(1)), mile(2));
    }

    @Test
    public void test_13_inch_plus_11_inch_equals_to_2_feet() throws Exception {
        assertEquals(inch(13).plus(inch(11)), feet(2));
    }
}
