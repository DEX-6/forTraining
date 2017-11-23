package DotComGame;

import java.util.ArrayList;
import java.util.List;

public class DotComBust {
    GameHelper helper = new GameHelper();
    List<DotCom> dotComList = new ArrayList<DotCom>();
    int numOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPaying();

//        int randomNam = (int) (Math.random() * 5);
//        int[] locations = {randomNam, randomNam + 1, randomNam + 2};
//        theDotCom.setLocationCells(locations);
//        boolean isAlive = true;

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
    * Метод предназначен для создания обьектов DotCom и присвоения им имен и адресов.
    * Устанавливает местоположение обьекта DotCom
    */
    void setUpGame() {
        DotCom vk = new DotCom();
        vk.setName("vk.com");
        DotCom mail = new DotCom();
        mail.setName("mail.ru");
        DotCom yandex = new DotCom();
        yandex.setName("yandex.ru");

        dotComList.add(vk);
        dotComList.add(mail);
        dotComList.add(yandex);

        System.out.println("Ваша цель потопить три сайта");
        System.out.println("vk.com, mail.ru, yandex.ru");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList) {
//            Вызываем впомогательный метод PlaceDotCom() из вспомогательного класса, чтобы получить
//            случайно выбранное местоположение для сайта
            List<String> newLocation = helper.placeDotCom(3);
//            Устанавливаем местоположение для каждого сайта
            dotComToSet.setLocationCells(newLocation);
        }
    }

    /**
     * Метод запрашивает у пользователя ход и вызывает метод checkUserGuesses(),
     * пока все обьекты DotCom не выведены из игры
     */

    void startPaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuesses(userGuess);
        }
        finishGame();
    }

    /**
     * Метод, который просматривает все остальные обьекты DotCom и
     * вызывает каждый обьект DotMom метода checkYourself()
     */
    void checkUserGuesses(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }

            if (result.equals("Потопил")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    /**
     * Метод, который выводит на экран сообщение об успехах пользователя, основывавясь на том,
     * за сколько ходов тот потопил все обьекты DotCom
     */
    void finishGame() {
        System.out.println("Все сайты ушли ко дну!");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло всего " + numOfGuesses + " попыток!");
        } else {
            System.out.println("Это заняло довольно много времени. " + numOfGuesses + " попыток.");
        }
    }


}

























