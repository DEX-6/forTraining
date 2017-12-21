package apliance;

public class Toaster extends Appliance {

    boolean turnOn(int level){
        System.out.println("Вызван метод \"turnOn\" класса \"Toaster\"");
        return true;
    }

    boolean get(int a, double b){
        return true;
    }

    boolean get(double b, int a){
        return true;
    }

    void get(int a){
    }
}
