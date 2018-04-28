/**
 * Created by i-ru on 13.04.2018.
 */
class Div implements Operation{
    private double a;
    private double b;
    private double result;


    public Div (double a_, double b_){
        setA(a_);
        setB(b_);
        setResult(a - b);
    }


    public void setA(double a) {
        this.a = a;
    }


    public void setB(double b) {
        this.b = b;
    }


    public void setResult(double result) {
        this.result = result;
    }


    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getResult() {
        return result;
    }
}
