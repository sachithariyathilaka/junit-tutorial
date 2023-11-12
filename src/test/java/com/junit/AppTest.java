package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class AppTest {

    private static App app;

    @BeforeClass
    public static void init() {
        app = new App();
        System.out.println("Init method executed as before class method.");
    }

    @Test(timeout = 5000)
    public void assertEqualTest() {
        System.out.println("assert equal test case started.");
        assertEquals(true, app.calculate(100, 25));
        System.out.println("assert equal test case passed.");
    }

    @Test(timeout = 5000)
    public void assertTrueTest() {
        System.out.println("assert true test case started.");
        assertTrue(app.calculate(100, 25));
        System.out.println("assert true test case passed.");
    }

    @Test(timeout = 5000)
    public void assertFalseTest() {
        System.out.println("assert false test case started.");
        assertFalse(app.calculate(25, 100));
        System.out.println("assert false test case passed.");
    }

    @Test(timeout = 5000)
    public void assertNullTest() {
        System.out.println("assert null test case started.");
        assertNull(app.duplicate(null));
        System.out.println("assert null test case passed.");
    }

    @Test(timeout = 5000)
    public void assertNotNullTest() {
        System.out.println("assert not null test case started.");
        assertNotNull(app.duplicate("Not null test case"));
        System.out.println("assert not null test case passed.");
    }

    @AfterClass
    public static void terminate() {
        System.out.println("Terminate method executed as after class method.");
    }
}
