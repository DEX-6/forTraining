package collections;

import java.lang.reflect.Array;
import java.util.*;

public class Maps {
    public static void main(String[] args) {

//        // #1

//        Map<String, String> device1 = new HashMap<>();
//        Map<String, String> device2 = new HashMap<>();
//        List<Map> devices = new ArrayList<>();
//
//        device1.put("Тип", "АТМ");
//        device1.put("Номер","0001");
//
//        device2.put("Тип", "ИПТ");
//        device2.put("Номер", "0002");
//
//        devices.add(device1);
//        devices.add(device2);
//        System.out.println(devices.get(0));
//        System.out.println(devices.get(1));
//
//        System.out.println(devices.indexOf(device1));
//        System.out.println(devices.indexOf(device2));

//        Map <List <String>, List<String>> device = new HashMap<>();

//        // #2
//        List <Map<String, String>> device_1 = new ArrayList<>();
//        List <Map<String, String>> device_2;
//        List <String> fieldNames = new ArrayList<>();
//        List <String> cellsValues = new ArrayList<>();
//
//        fieldNames.add("Тип");
//        fieldNames.add("Номер");
//        fieldNames.add("Статус");
//
//        cellsValues.add("АТМ");
//        cellsValues.add("001");
//        cellsValues.add("Открыт");
//
//        for (int i = 0; i < fieldNames.size(); i++){
//            Map<String, String> cellValue = new HashMap();
//            cellValue.put(fieldNames.get(i), cellsValues.get(i));
//            device_1.add(cellValue);
//        }
//
//        device_2 = new ArrayList<>(device_1);
//
//        System.out.println(device_1);
//
//        List <List> devices = new ArrayList<>();
//        devices.add(device_1);
//        devices.add(device_2);
//        System.out.println(devices);

//        // #3
        Map <String, List<String>> map = new HashMap<>();
        List <String> list1 = Arrays.asList("aaa", "aaa");
        List <String> list2 = Arrays.asList("bbb", "bbb");
        String s1 = "3";
        String s2 = "2";

        map.put(s1, list1);
        map.put(s2, list2);

        System.out.println(map);

    }
}
