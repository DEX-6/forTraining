package batRunner;

import java.io.File;
import java.io.IOException;

public class BatRunner {

    public static void main(String[] args) throws IOException {
        File hub = new File("src/main/java/batRunner");
//        String cmd = "cmd " + hub.getAbsolutePath() + "/" + hub.getName();
//        System.out.println(cmd);
        Runtime.getRuntime().exec("cmd C:/Users/red/IdeaProjects/fortraning1/forTraining/ForTraining/src/main/java/batRunner/hub.bat");
//        System.out.println("hub.getAbsolutePath: " + hub.getAbsolutePath());
//        System.out.println("hub.getCanonicalPath: " + hub.getCanonicalPath());
//        System.out.println("hub.getName" + hub.getName());
    }
}
