package junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestList {
    @Test
    public void testFind() {
        List myList = new List();
        myList.insert(1);
        myList.insert(2);
        myList.insert(3);

        assertTrue(myList.find(2));
        assertFalse(myList.find(4));
    }

    @Test
    public void testInsert() {
        List myList = new List();
        myList.insert(1);
        myList.insert(2);
        myList.insert(3);

        assertTrue(myList.find(2));
        assertTrue(myList.find(3));
        assertTrue(myList.find(1));
    }
}
