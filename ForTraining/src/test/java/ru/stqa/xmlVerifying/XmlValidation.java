package ru.stqa.xmlVerifying;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.Difference;
import org.hamcrest.number.OrderingComparison;
import org.xmlunit.diff.ElementSelectors;
import org.xmlunit.matchers.CompareMatcher;
import ru.stqa.xmlVerifying.differenceEvaluators.IgnoreAttributeDifferenceEvaluator;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.not;
//import static org.junit.Assert.assertThat;
import static org.xmlunit.matchers.CompareMatcher.isIdenticalTo;


public class XmlValidation {
    @Test
    public void given2XMLS_whenIdentical_thenCorrect() {
        String controlXml = "<struct><int>3</int><boolean>false</boolean></struct>";
        String testXml = "<struct><int>3</int><boolean>false</boolean></struct>";
        Assert.assertThat(testXml, isIdenticalTo(controlXml));
    }

    @Test
    public void given2XMLSWithSimilarNodesButDifferentSequence_whenNotIdentical_thenCorrect() {
        String controlXml = "<struct><int>3</int><boolean>false</boolean></struct>";
        String testXml = "<struct><boolean>false</boolean><int>3</int></struct>";
        Assert.assertThat(testXml, not(isIdenticalTo(controlXml)));
    }

    @Test
    public void given2XMLS_whenGeneratesDifferences_thenCorrect(){
        String controlXml = "<struct><int>3</int><boolean>false</boolean></struct>";
        String testXml = "<struct><boolean>false</boolean><int>3</int></struct>";
        Diff myDiff = DiffBuilder.compare(controlXml).withTest(testXml).build();

        Iterator<Difference> iter = myDiff.getDifferences().iterator();
        int size = 0;
        while (iter.hasNext()) {
            iter.next().toString();
            size++;
        }
        Assert.assertThat(size, OrderingComparison.greaterThan(1));
    }

//    5. Comparing Specific Nodes
    @Test
    public void given2XMLS_whenSimilar_thenCorrect() {
        String controlXml = "<struct><int>3</int><boolean>false</boolean></struct>";
        String testXml = "<struct><boolean>false</boolean><int>3</int></struct>";

        Assert.assertThat(testXml,
                CompareMatcher.isSimilarTo(controlXml)
                        .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byName)));
    }

    @Test
    public void given2XMLS_whenSimilar_thenCorrect_2() {
        String controlXml = "<struct><int>3</int><boolean>false</boolean></struct>";
        String testXml = "<struct><int>4</int><boolean>false</boolean></struct>";

        Assert.assertThat(testXml,
                CompareMatcher.isSimilarTo(controlXml)
                        .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndText)));
    }


//    6. Custom DifferenceEvaluator
@Test
public void given2XMLsWithDifferences_whenTestsDifferentWithoutDifferenceEvaluator_thenCorrect() {
    final String control = "<a><b attr=\"abc\"></b></a>";
    final String test = "<a><b attr=\"xyz\"></b></a>";
    Diff myDiff = DiffBuilder.compare(control).withTest(test)
            .withDifferenceEvaluator(new IgnoreAttributeDifferenceEvaluator("attr"))
            .checkForSimilar().build();
    Assert.assertFalse(myDiff.toString(), myDiff.hasDifferences());
}

@Test
public void given2XMLsWithDifferencesInNestedNodes(){
        String control = "<table>\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <th>some key</th>\n" +
                "      <td>some value</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <th>another key</th>\n" +
                "      <td>another value</td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>";
        String test = "<table>\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <th>another key</th>\n" +
                "      <td>another value</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <th>some key</th>\n" +
                "      <td>some value</td>\n" +
                "    </tr>\n" +
                "  </tbody>\n" +
                "</table>";
    Diff myDiff = DiffBuilder.compare(control).withTest(test)
            .withNodeMatcher(new DefaultNodeMatcher
                    (ElementSelectors.byXPath("tr/th", ElementSelectors.byNameAndText)))
            .checkForSimilar().build();
    Assert.assertFalse(myDiff.toString(), myDiff.hasDifferences());
}

}
