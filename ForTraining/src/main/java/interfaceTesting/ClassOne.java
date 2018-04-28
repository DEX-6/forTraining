package interfaceTesting;

public class ClassOne implements InterfaceOne {
    @Override
    public void methodOne() {
        System.out.println("Method One");
    }

    public void someMethod(){
        System.out.println("Some method");
    }
}
