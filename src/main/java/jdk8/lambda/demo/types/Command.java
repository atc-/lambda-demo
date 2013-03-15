package jdk8.lambda.demo.types;

/**
 * Represents a verb or some intent within a system. Helps demonstrate the capabilities of the function, predicate
 * types by allowing a "strategy" oriented pattern. A predicate dictates whether a set of "on-true" or "on-false"
 * actions are invoked.
 * @param <I> input
 * @param <O> output
 */
public interface Command<I, O> {
    O evaluate(I input);
}
