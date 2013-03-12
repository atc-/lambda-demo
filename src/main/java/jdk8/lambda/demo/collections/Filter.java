package jdk8.lambda.demo.collections;

import java.util.*;

public class Filter {

    private static final Collection<Integer> ALL_INTS_TO_1MILL = new HashSet<>();

    static {
        for (int i = 0; i <= 1000000; i++) {
            ALL_INTS_TO_1MILL.add(i);
        }
    }

    public Iterator<Integer> odds() {
        // This is merely a lazy view of the underlying collection
        return ALL_INTS_TO_1MILL.stream().filter(i -> i % 2 != 0).iterator();
    }
}
