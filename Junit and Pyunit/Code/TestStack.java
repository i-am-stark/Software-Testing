package junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStack {
    @Test
    public void testPushAndPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals((int) stack.pop(), 3);
        assertEquals((int) stack.pop(), 2);
        assertEquals((int) stack.pop(), 1);
        assertTrue(stack.isEmpty());
    }
}
