package io.github.sachithariyathilaka;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Main class for the application test.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/03
 */
public class JUnitTutorialTest {

    private static JUnitTutorial JUnitTutorial;

    /**
     * Before class method for the test application.
     */
    @BeforeClass
    public static void init() {
        JUnitTutorial = new JUnitTutorial();
        System.out.println("Init method executed as before class method.");
    }

    /**
     * Assert equal test case.
     */
    @Test(timeout = 5000)
    public void assertEqualTest() {
        System.out.println("assert equal test case started.");
        assertEquals(true, JUnitTutorial.compare(100, 25));
        System.out.println("assert equal test case passed.");
    }

    /**
     * Assert true test case.
     */
    @Test(timeout = 5000)
    public void assertTrueTest() {
        System.out.println("assert true test case started.");
        assertTrue(JUnitTutorial.compare(100, 25));
        System.out.println("assert true test case passed.");
    }

    /**
     * Assert false test case.
     */
    @Test(timeout = 5000)
    public void assertFalseTest() {
        System.out.println("assert false test case started.");
        assertFalse(JUnitTutorial.compare(25, 100));
        System.out.println("assert false test case passed.");
    }

    /**
     * Assert null test case.
     */
    @Test(timeout = 5000)
    public void assertNullTest() {
        System.out.println("assert null test case started.");
        assertNull(JUnitTutorial.duplicate(null));
        System.out.println("assert null test case passed.");
    }

    /**
     * Assert not null test case.
     */
    @Test(timeout = 5000)
    public void assertNotNullTest() {
        System.out.println("assert not null test case started.");
        assertNotNull(JUnitTutorial.duplicate("Not null test case"));
        System.out.println("assert not null test case passed.");
    }

    /**
     * After class method for the test application.
     */
    @AfterClass
    public static void terminate() {
        System.out.println("Terminate method executed as after class method.");
    }
}
