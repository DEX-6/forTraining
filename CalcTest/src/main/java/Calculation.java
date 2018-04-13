import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try {
                System.out.print("Введите первое дробное число: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Введите второе дробное число: ");
                double secondNumber = scanner.nextDouble();
                System.out.print("Выберете операцию (+,-,*,/): ");
                char op = scanner.next().charAt(0);
                Calc calc = new Calc(op, firstNumber, secondNumber);


            } catch (InputMismatchException a){
                System.out.println("Вы ввели неверный формат числа");
                break;
            }




            System.out.println("Продолжить? Y/N");
            char answer = scanner.next().charAt(0);


            switch (answer){
                case 'Y':
                    flag = true;
                    break;
                case 'N':
                    flag = false;
                    break;
                default:
                    flag = true;
                    break;
            }
        }
    }
}


