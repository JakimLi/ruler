package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.ruler.Length.mile;

public class LengthAdditionTest {

    @Test
    public void one_mile_plus_one_mile_equals_to_2_mile() throws Exception {
        assertEquals(mile(1).plus(mile(1)), mile(2));
    }
}
