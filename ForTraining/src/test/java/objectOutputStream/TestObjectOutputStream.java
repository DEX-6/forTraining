package objectOutputStream;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.UUID;

public class TestObjectOutputStream {
    @Test
    public void test() throws IOException {
        String s = "123";
        File dir = new File("src\\test\\resources\\files\\bin");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(dir.getPath() + "\\file" + UUID.randomUUID().toString() + ".txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
    }
}
