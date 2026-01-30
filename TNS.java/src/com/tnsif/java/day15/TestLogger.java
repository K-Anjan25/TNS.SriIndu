package com.tnsif.java.day15;


class Logger {
    @SuppressWarnings("unused")
    public void log(String message) {
        int unusedVariable = 10;
        System.out.println("Log: " + message);
    }
}


public class TestLogger {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Hello, World!");
    }
}


