package propertiesTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

//        Вариант 1. Использование загрузчика этого класса (PropertiesTest) (не работает)
//        InputStream inputStream = PropertiesTest.class.getClass().getClassLoader().getResourceAsStream("testProp.properties");
//        properties.load(inputStream);
//        System.out.println(properties.getProperty("name"));

//        Вариант 2. Использование системного загрузчика (работает)
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("testProp.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("name"));
    }


}
