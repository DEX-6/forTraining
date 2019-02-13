package ru.stqa.xmlVerifying.predicates;

import org.w3c.dom.Node;
import org.xmlunit.util.Predicate;

public class TrPredicate implements Predicate<Node> {
    @Override
    public boolean test(Node toTest) {

        return false;
    }
}
