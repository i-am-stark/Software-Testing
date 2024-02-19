package jumble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinToHexTest {

    @Test
    public void testConvertBinaryToHexadecimal() {
    	BinToHex converter = new BinToHex();
        assertEquals("A", converter.convertBinaryToHexadecimal("1010"));
        assertEquals("1F", converter.convertBinaryToHexadecimal("11111"));
    }

    @Test
    public void testConvertBinaryToHexadecimalWithZero() {
    	BinToHex converter = new BinToHex();
        assertEquals("0", converter.convertBinaryToHexadecimal("0"));
    }

    @Test
    public void testConvertBinaryToHexadecimalWithLeadingZeros() {
    	BinToHex converter = new BinToHex();
        assertEquals("3E8", converter.convertBinaryToHexadecimal("1111101000"));
    }

    @Test
    public void testConvertBinaryToHexadecimalWithNegativeBinary() {
    	BinToHex converter = new BinToHex();
        assertEquals("64", converter.convertBinaryToHexadecimal("1100100"));


    }
}
