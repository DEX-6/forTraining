package DotComGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    //    private int[] locationCells;
//    private int numOfHits = 0;
//    private String result;

    public String checkYourself(String userInput) {
        String result = "Мимо";
//        int guess = Integer.parseInt(StringGuess);
//        for (int cell : locationCells) {
//            if (guess == cell) {
//                result = "Попал";
//                numOfHits++;
//                break;
//            } else result = "Мимо";
//        }

//        if (numOfHits == locationCells.length) {
//            result = "Потопил";
//        }
//        System.out.println(result);
//        return result;

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        } else {
            result = "Мимо";
        }
        return result;
    }

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public void setName(String name){
       this.name = name;
    }

}





























