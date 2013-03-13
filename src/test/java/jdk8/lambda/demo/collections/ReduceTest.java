package jdk8.lambda.demo.collections;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

public class ReduceTest {

    private Reduce reduce;

    @Before
    public void setUp() {
        reduce = new Reduce();
    }

    @Test
    public void testSum() throws Exception {
        final Collection<Double> doubleCollection = new ArrayList<>(1);
        doubleCollection.add(1d);
        assertEquals(1d, reduce.sum(doubleCollection));

        doubleCollection.clear();
        doubleCollection.add(1d);
        doubleCollection.add(1d);
        doubleCollection.add(1d);
        doubleCollection.add(1d);
        doubleCollection.add(1d);
        assertEquals(5d, reduce.sum(doubleCollection));
    }
}
