package propertiesTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropLoader {

    public Properties loadTestProp() throws IOException {
        Properties prop = new Properties();
        InputStream ins = this.getClass().getClassLoader().getResourceAsStream("testProp.properties");
        prop.load(ins);
        return prop;
    }
}
