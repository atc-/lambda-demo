package jdk8.lambda.demo.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {

    private static final Collection<Integer> ALL_INTS_TO_1MILL = new HashSet<>();

    static {
        for (int i = 0; i <= 1000000; i++) {
            ALL_INTS_TO_1MILL.add(i);
        }
    }

    /**
     * Return all odd integers within 0 <= x <= 1 million
     * @return a lazy Stream view of ALL_INTS_TO_1MILL
     */
    public Stream<Integer> odds() {
        return ALL_INTS_TO_1MILL.stream().filter(i -> i % 2 != 0);
    }

    /**
     * Return all even integers within 0 <= x <= 1 million
     * @return a lazy Stream view of ALL_INTS_TO_1MILL
     */
    public Stream<Integer> evens() {
        return ALL_INTS_TO_1MILL.stream().filter(i -> i % 2 == 0);
    }

    /**
     * Demonstrates functions as a type
     * @param func the predicate function for filter
     * @return a lazy Stream view of ALL_INTS_TO_1MILL
     */
    public Stream<Integer> filter(final Predicate func) {
        return ALL_INTS_TO_1MILL.stream().filter(func);
    }
}
