/**
 * Created by i-ru on 13.04.2018.
 */
public class Mult implements Operation {
    private double a;
    private double b;
    private double result;


    public Mult(double a_, double b_) {
        setA(a_);
        setB(b_);
        setResult(a * b);
    }


    public void setA(double a) {
        this.a = a;
    }


    public double getA() {
        return a;
    }


    public void setB(double b) {
        this.b = b;
    }


    public double getB() {
        return b;
    }


    public void setResult(double result) {
        this.result = result;
    }


    public double getResult() {
        return result;
    }
}
