package xmlDomParserTest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMxmlReader {
    public static void main(String args[]) {
        String filePath = "src\\main\\java\\xmlDomParserTest\\languages.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
//            Получаем узлы с именем "Language"
            NodeList nodeList = doc.getElementsByTagName("Language");
            Node node = nodeList.item(1);
            System.out.println(node.getNodeName());
            System.out.println(node.getTextContent());
            System.out.println(node.getFirstChild().getNodeName());
            System.out.println(node.getFirstChild().getTextContent());
            Element element = (Element) node;
            System.out.println( element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
            // создадим из него список объектов Language
//            List<Language> langList = new ArrayList<Language>();
//            for (int i = 0; i < nodeList.getLength(); i++) {
//                langList.add(getLanguage(nodeList.item(i)));
//            }
//
//             печатаем в консоль информацию по каждому объекту Language
//            for (Language lang : langList) {
//                System.out.println(lang.toString());
//            }
        } catch (Exception e) {
        e.getMessage();
        }
    }

    // создаем из узла документа объект Language
    private static Language getLanguage(Node node) {
        Language lang = new Language();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            lang.setName(getTagValue("name", element));
            lang.setAge(Integer.parseInt(getTagValue("age", element)));
        }

        return lang;
    }

    // получаем значение элемента по указанному тегу
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
}
