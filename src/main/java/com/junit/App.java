package com.junit;


public class App {

    public static void main( String[] args ) {
        System.out.println(new App().calculate(100, 25));
    }

    public boolean calculate(int a, int b) {
        return a > b;
    }

    public Object duplicate(Object object) {
        return object;
    }
}
