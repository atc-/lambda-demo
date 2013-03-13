package jdk8.lambda.demo.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Predicate;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class FilterTest {

    private Filter filter;

    @Before
    public void setUp() {
        filter = new Filter();
    }

    @Test
    public void testOdds() throws Exception {
        assertEquals(500000, filter.odds().toArray().length);
    }

    @Test
    public void testEvens() throws Exception {
        assertEquals(500000, filter.odds().toArray().length);
    }

    @Test
    public void testFilter() throws Exception {
        final Predicate p = (o) -> (o != null);
        assertEquals(1000001, filter.filter(p).toArray().length);
    }
}
