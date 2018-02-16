package exceptions;

public class TestException extends Exception {

    private String message;

    public TestException(String message){
        this.message = message;
    }

    public TestException(){

    }
}
