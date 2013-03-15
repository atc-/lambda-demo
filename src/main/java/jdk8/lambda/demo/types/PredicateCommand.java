package jdk8.lambda.demo.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateCommand implements Command<Object, Collection<Object>> {
    private final Predicate predicate;
    private final Object data;
    private final Collection<Function> onTrue;
    private final Collection<Function> onFalse;

    /**
     * Create an immutable instance.
     * @param predicate the test to evaluate
     * @param data the input for the predicate
     * @param onTrue list of functions to invoke with {@code predicate}'s output and
     *  {@code data} if {@code predicate} evaluates to true
     * @param onFalse list of functions to invoke with {@code predicate}'s output and
     *  {@code data} if {@code predicate} evaluates to false
     */
    public PredicateCommand(final Predicate predicate, final Object data,
                       final Collection<Function> onTrue, final Collection<Function> onFalse) {
        this.predicate = predicate;
        this.data = data;
        this.onTrue = onTrue;
        this.onFalse = onFalse;
    }

    @Override
    public Collection<Object> evaluate(final Object input) {
        Collection<Function> toInvoke = predicate.test(input) ? onTrue : onFalse;
        final Collection<Object> retCol = new ArrayList<>(toInvoke.size());
        toInvoke.stream().map((Function f) -> (retCol.add(f.apply(input))));
        return retCol;
    }
}

