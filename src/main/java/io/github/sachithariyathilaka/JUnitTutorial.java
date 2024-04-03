package io.github.sachithariyathilaka;

/**
 * Main class for the application.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/03
 */
public class JUnitTutorial {

    public static void main( String[] args ) {
        JUnitTutorial jUnitTutorial = new JUnitTutorial();
        System.out.println(jUnitTutorial.compare(100, 25));
    }

    /**
     * Use to compare two give integers.
     *
     * @param   a the first value
     * @param   b the second value
     *
     * @return  the boolean
     */
    public boolean compare(int a, int b) {
        return a > b;
    }

    /**
     * Use to duplicate teh give object.
     *
     * @param   object the object
     *
     * @return  the object
     */
    public Object duplicate(Object object) {
        return object;
    }
}
