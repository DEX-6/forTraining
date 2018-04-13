/**
 * Created by i-ru on 13.04.2018.
 */
class Sum implements Operation{
    private double a;
    private double b;
    private double result;


    public Sum (double a_, double b_){
        setA(a_);
        setB(b_);
        setResult(a+b);
    }


    public double getA() {
        return a;
    }


    public void setA(double a) {
        this.a = a;
    }


    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }


    public double getResult() {
        return result;
    }


    public void setResult(double result) {
        this.result = result;
    }
}
