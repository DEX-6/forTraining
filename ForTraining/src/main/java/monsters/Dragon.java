package monsters;

public class Dragon extends Monster {

    String name = "Gena";
    @Override
    boolean frighten(int degree) {
        System.out.println("Огненное дыхание");
        return true;
    }

    String getName(){
        return name;
    }
}
