package com.bobocode.fp;

/**
 * An util class that provides a factory method for creating an instance of a {@link FunctionMap} filled with a list
 * of functions.
 * <p>
 * TODO: implement a method and verify it by running {@link FunctionsTest}
 * <p>
 * TODO: if you find this exercise valuable and you want to get more like it, <a href="https://www.patreon.com/bobocode"> 
 *     please support us on Patreon</a>
 *
 * @author Taras Boychuk
 */
public class Functions {
    private Functions() {
    }

    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();
        intFunctionMap.addFunction("abs", Functions::abs);
        intFunctionMap.addFunction("sgn", Functions::sgn);
        intFunctionMap.addFunction("increment", Functions::increment);
        intFunctionMap.addFunction("decrement", Functions::decrement);
        intFunctionMap.addFunction("square", Functions::square);
        // todo: according to the javadoc add functions using lambda expression

        return intFunctionMap;
    }

    private static Integer square(Integer integer) {
        return (int) Math.pow(integer, 2);
    }

    private static Integer decrement(Integer integer) {
        return Math.decrementExact(integer);
    }

    private static Integer increment(Integer integer) {
        return Math.incrementExact(integer);
    }

    private static Integer sgn(Integer integer) {
        return (int) Math.signum(integer);
    }

    private static Integer abs(Integer integer) {
        return Math.abs(integer);
    }
}
