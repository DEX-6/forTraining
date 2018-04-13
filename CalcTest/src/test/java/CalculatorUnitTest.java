import org.junit.Assert;
import org.junit.Test;

/**
 * Created by i-ru on 12.04.2018.
 */
public class CalculatorUnitTest {
    private Calculation calculation = new Calculation();

    @Test
    public void divTest(){
        Div div = new Div(1.1, 1.1);
        double actualResult = div.getResult();
        double expectedResult = 0.0;
        Assert.assertTrue("Ожидаемый результат \"" + expectedResult + "\" не равен актуальному \"" + actualResult +"\"",
                actualResult == expectedResult);
    }

    @Test
    public void sumTest(){
        Sum sum = new Sum(1.0, 1.0);
        double actualResult = sum.getResult();
        double expectedResult = 2.0;
        Assert.assertTrue("Ожидаемый результат \"" + expectedResult + "\" не равен актуальному \"" + actualResult +"\"",
                actualResult == expectedResult);
    }

    @Test
    public void multTest(){
        Mult mult = new Mult(1.0, 3.0);
        double actualResult = mult.getResult();
        double expectedResult = 3.0;
        Assert.assertTrue("Ожидаемый результат \"" + expectedResult + "\" не равен актуальному \"" + actualResult +"\"",
                actualResult == expectedResult);
    }

    @Test
    public void quotientTest(){
        Quotient quotient = new Quotient(3.0, 3.0);
        double actualResult = quotient.getResult();
        double expectedResult = 1.0;
        Assert.assertTrue("Ожидаемый результат \"" + expectedResult + "\" не равен актуальному \"" + actualResult +"\"",
                actualResult == expectedResult);
    }
}
