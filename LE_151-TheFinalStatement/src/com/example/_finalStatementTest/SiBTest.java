package com.example._finalStatementTest;

public class SiBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SiBTest block called");
    }

    public SiBTest() {
        System.out.println("SiB constructor called");
    }

    static {
        System.out.println("Second SiBTest block called");

    }

    public void someMethod() {
        System.out.println("some method called");
    }
}
