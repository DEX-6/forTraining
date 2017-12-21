package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list2.add("3");
        list3.add("2");
        list3.add("1");

//        list2.add("4");

        list.add(list1);
        list.add(list2);
        list.add(list3);

        for (int i = 0; i < list.size(); i++){
        System.out.println(list.get(i));
        }


        System.out.println(list1.containsAll(list3));
    }
}
