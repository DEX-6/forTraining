/**
 * Created by i-ru on 13.04.2018.
 */
class Calc {
    private Operation result;


    public Calc (char op, double a, double b){
        switch (op){
            case '+':
                result = new Sum(a, b);
                System.out.println(result.getResult());
                break;
            case '-':
                result = new Div(a, b);
                System.out.println(result.getResult());
                break;
            case '*':
                result = new Mult(a, b);
                System.out.println(result.getResult());
                break;
            case '/' :
                result = new Quotient(a, b);
                System.out.println(result.getResult());
                break;
            default:
                result = new Sum (a, b);
                System.out.println(result.getResult());
                break;
        }
    }



}
