package ru.stqa.xmlVerifying;

import org.junit.Test;
import org.w3c.dom.Node;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.*;
import org.xmlunit.util.Predicate;

import java.io.InputStream;

import static org.xmlunit.diff.ElementSelectors.byName;
import static org.xmlunit.diff.ElementSelectors.byNameAndText;


public class XmlValidation {
    @Test
    public void given2XMLsWithDifferencesInNestedNodes_2() {
        InputStream control = this.getClass().getClassLoader().getResourceAsStream("control.xml");
        InputStream test = this.getClass().getClassLoader().getResourceAsStream("test.xml");

        Diff myDiff = DiffBuilder.compare(control)
                .withTest(test)
                .ignoreComments()
                .ignoreWhitespace()
                .ignoreElementContentWhitespace()
                .checkForIdentical()
                .checkForSimilar()
                .withComparisonController(ComparisonControllers.Default)
                .withNodeMatcher(
                        new DefaultNodeMatcher
                                (ElementSelectors.conditionalBuilder()
                                        .whenElementIsNamed("tr")
                                        .thenUse(ElementSelectors.byXPath("./th", byNameAndText))
                                        .elseUse(byName).build()
                                        , ElementSelectors.conditionalBuilder().whenElementIsNamed("tr")
                                        .thenUse(ElementSelectors.byXPath("./td", byNameAndText))
                                        .elseUse(byName).build()
                                )
                )
                .build();

        printDifferences(myDiff);

    }

    @Test
    public void differencesBetweenByNameAndByNameAndText() {
        InputStream control = this.getClass().getClassLoader().getResourceAsStream("control.xml");
        InputStream test = this.getClass().getClassLoader().getResourceAsStream("test.xml");

        Diff myDiff = DiffBuilder.compare(control)
                .withTest(test)
                .ignoreComments()
                .ignoreWhitespace()
                .ignoreElementContentWhitespace()
                .checkForIdentical()
                .checkForSimilar()
                .withComparisonController(ComparisonControllers.Default)
                .withNodeMatcher(
                        new DefaultNodeMatcher
                                (ElementSelectors.conditionalBuilder()
                                     //  "Когда находим элемент tr С наследником th
                                     // сравниваем tr по названию элементов и тексту"
                                        .whenElementIsNamed("tr")
                                        .thenUse(ElementSelectors.byXPath("./th", byNameAndText))
                                        .elseUse(byName).build()
                                )
                )
                .withNodeFilter(
                        node -> !(node.getTextContent().equals("0"))
                )
                .build();

        printDifferences(myDiff);

    }

    private void printDifferences(Diff myDiff) {
        int i = 1;
        System.out.println("---------------------------------------------------------------------");
        for (Difference diff : myDiff.getDifferences()) {
            System.out.println(i++);
            System.out.println("RESULT: " + diff.getComparison());
            System.out.println("TEST XPATH: " + diff.getComparison().getTestDetails().getXPath());
            System.out.println("CONTROL XPATH: " + diff.getComparison().getControlDetails().getXPath());
            System.out.println("TEST VALUE: " + diff.getComparison().getTestDetails().getValue());
            System.out.println("CONTROL VALUE: " + diff.getComparison().getControlDetails().getValue());
            System.out.println("TEST TEXT CONTENT:" + diff.getComparison().getTestDetails().getTarget().getTextContent());
//            System.out.println("CONTROL TEXT CONTENT:" + diff.getComparison().getControlDetails().getTarget().getTextContent());
            System.out.println("---------------------------------------------------------------------");
        }
        System.out.println("Наличие различий " + myDiff.hasDifferences());
    }

    @Test
    public void getDifferences() {
        String controlXml = "<struct>" +
                "<boolean>false</boolean>" +
                "<int>4</int>" +
                "<int>3</int>" +
                "</struct>";
        String testXml = "<struct>" +
                "<int>3</int>" +
                "<int>4</int>" +
                "<boolean>false</boolean>" +
                "</struct>";

        Diff myDiff = DiffBuilder.compare(controlXml).withTest(testXml).checkForSimilar().withNodeMatcher(new DefaultNodeMatcher(byNameAndText)).build();
        for (Difference diff : myDiff.getDifferences()) {
            System.out.println("test comparison: " + diff.getComparison());
            System.out.println("test target: " + diff.getComparison().getTestDetails().getTarget());
            System.out.println("test value: " + diff.getComparison().getTestDetails().getValue());
            System.out.println("test comparison type: " + diff.getComparison().getType());
            System.out.println("test result:" + diff.getResult());
        }

        System.out.println("has differences " + myDiff.hasDifferences());

    }

}
