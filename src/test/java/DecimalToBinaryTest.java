import hello.DecimalToBinaryController;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DecimalToBinaryTest {

    @Test
    public void convert() throws Exception {
        DecimalToBinaryController converter = new DecimalToBinaryController();
        String actual = converter.convert(10);
        assertEquals(actual,"1010");
    }
}