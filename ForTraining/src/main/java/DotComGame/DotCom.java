package DotComGame;

import java.util.ArrayList;
import java.util.List;

public class DotCom {
    private List<String> locationCells;
    private String name;

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Вы потопили " + name);
            } else {
                result = "Попал";
            }
        }
//        else {
//            result = "Мимо";
//        }
        return result;
    }

    public void setLocationCells(List<String> loc) {
        locationCells = loc;
    }
    public void setName(String name){
       this.name = name;
    }

}





























