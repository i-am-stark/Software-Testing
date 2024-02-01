package junit;

import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;

public class TestDifferentConstructors{
    private ClassWithConstructor1 obj1;
    private ClassWithConstructor2 obj2;
    private ClassWithConstructor3 obj3;
    private ClassWithConstructor4 obj4;
    private ClassWithConstructor5 obj5;

    @Before
    public void setUp() {
        obj1 = new ClassWithConstructor1(10);
        obj2 = new ClassWithConstructor2(20, 30);
        obj3 = new ClassWithConstructor3(40, 50, 60);
        obj4 = new ClassWithConstructor4(70, 80, 90, 100);
        obj5 = new ClassWithConstructor5(110, 120, 130, 140, 150);
    }

    @Test
    public void test1() {
        assertNotEquals(obj1.isSimilar(obj2), true);
    }

    @Test
    public void test2() {
        assertNotEquals(obj2.isSimilar(obj3), true);
    }

    @Test
    public void test3() {
        assertNotEquals(obj3.isSimilar(obj4), true);
    }

    @Test
    public void test4() {
        assertNotEquals(obj4.isSimilar(obj5), true);
    }

    @Test
    public void test5() {
        assertNotEquals(obj5.isSimilar(obj1), true);
    }
}
