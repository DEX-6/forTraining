package monsters;

public class Vampire extends Monster {
    @Override
    boolean frighten(int d) {
        System.out.println("Укусить?");
        return false;
    }
}
