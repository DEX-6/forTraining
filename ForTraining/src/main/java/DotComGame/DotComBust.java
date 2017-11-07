package DotComGame;

import java.util.ArrayList;
import java.util.List;

public class DotComBust {
    GameHelper helper = new GameHelper();
    List<DotCom> dotComList = new ArrayList<DotCom>();
    int numOfGuesses = 0;

    public static void main(String[] args) {

        int randomNam = (int) (Math.random() * 5);
        int[] locations = {randomNam, randomNam + 1, randomNam + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

//        while (isAlive) {
//            String guess = helper.getUserInput("Введите число");
//            String result = theDotCom.checkYourself(guess);
//            numOfGuesses++;
//            if (result.equals("Потопил")) {
//                isAlive = false;
//                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
//            }
//        }
    }

    /* *
    * Метод предназначен для создания объектов DotCom и присвоения им имен и адресов.
    * Устанавливает местоположение обьекта DotCom
    */
    void setUpGame(List<DotCom> dotComList) {
        DotCom vk = new DotCom();
        vk.setName("vk.com");
        DotCom mail = new DotCom();
        mail.setName("mail.ru");
        DotCom yandex = new DotCom();
        yandex.setName("yandex.ru");

        dotComList.add(vk);
        dotComList.add(mail);
        dotComList.add(yandex);

        for (DotCom dc : dotComList) {

        }
    }

    /**
     * Метод запрашивает у пользователя ход и вызывает метод checkUserGuesses(),
     * пока все объекты DotCom не выведены из игры
     */

    void atartPaying() {

    }

    /**
     * Метод, который просматривает все остальные объекты DotCom и
     * вызывает каждый обьект DotMom метода checkYourself()
     */
    void checkUserGuesses() {

    }

    /**
     * Метод, который выводит на экран сообщение об успехах пользователя, основывавясь на том,
     * за сколько ходов тот потопил все объекты DotCom
     */
    void finishGame() {
    }


}

























