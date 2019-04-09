package jacksonXml.deserialization;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jacksonXml.additionalClasses.SimpleBean;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertTrue;

public class JacksonDeserialization {
    @Test
    public void deserializeFromTheXmlString() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        SimpleBean sb_original = new SimpleBean();
        System.out.println(String.format("original x = %s, original y = %s",
                sb_original.getX(), sb_original.getY()));
        SimpleBean sb_modified
                = xmlMapper.readValue("<SimpleBean><x>2</x><y>1</y></SimpleBean>", SimpleBean.class);
        System.out.println(String.format("modified x = %s, modified y = %s",
                sb_modified.getX(), sb_modified.getY()));
        assertTrue(sb_modified.getX() == 2 && sb_modified.getY() == 1);
    }

    @Test
    public void deserializeFromTheXmlFile() throws IOException {
        File file = new File("src\\test\\resources\\simple_bean.xml");
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        SimpleBean value = xmlMapper.readValue(xml, SimpleBean.class);
        assertTrue(value.getX() == 1 && value.getY() == 2);
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
