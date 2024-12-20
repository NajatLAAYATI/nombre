
package conversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {

    @Test
    public void testConvert() {
        assertEquals("I", ArabicRomanNumerals.convert(1));
        assertEquals("III", ArabicRomanNumerals.convert(3));
        assertEquals("IV", ArabicRomanNumerals.convert(4));
        assertEquals("IX", ArabicRomanNumerals.convert(9));
        assertEquals("X", ArabicRomanNumerals.convert(10));
        assertEquals("XXXIX", ArabicRomanNumerals.convert(39));
        assertEquals("L", ArabicRomanNumerals.convert(50));
    }
}