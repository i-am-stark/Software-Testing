package junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class rectangleTest {
    @Test
    public void testArea() {
        rectangle rect = new rectangle(5, 3);
        assertEquals(15, rect.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        rectangle rect = new rectangle(5, 3);
        assertEquals(16, rect.perimeter(), 0.001);
    }
}
