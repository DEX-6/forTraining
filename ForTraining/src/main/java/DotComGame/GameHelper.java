package DotComGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = reader.readLine();
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
            return inputLine;
    }

    public List<String> placeDotCom(int numOfCells){
        // TODO: 08.11.2017 Сделать генерацию номеров ячеек поумнее
        List <String> locationCells = new ArrayList<>();
        String [] letters = {"A", "B", "C" , "D", "E", "F"};
        int randomNam1 = (int) (Math.random() * 5);
        int randomNam2 = (int) (Math.random() * 5);
            locationCells.add(letters[randomNam1] + randomNam2);
            locationCells.add(letters[randomNam1] + (randomNam2 + 1));
            locationCells.add(letters[randomNam1] + (randomNam2 + 2));

//        int[] locations = {randomNam, randomNam + 1, randomNam + 2};

        return locationCells;
    }

}
