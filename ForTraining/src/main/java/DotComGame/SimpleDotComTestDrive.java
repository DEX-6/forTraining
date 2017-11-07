package DotComGame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        int[] locations = {2, 3, 4};
//        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        dot.checkYourself("3");
        dot.checkYourself("0");
        dot.checkYourself("5");
        dot.checkYourself("4");
    }
}
