package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueElemntPractice {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("omar");
        names.add("omar");
        names.add("madjid");
        names.add("madjid");
        names.add("farid");
        names.add("hocine");
        HashSet <String> hashSet=new HashSet<>();
        hashSet.addAll(names);
        System.out.println(hashSet);

        // second idea
        HashSet <String> hashSet1=new HashSet<>();
        for (String name :names){
            hashSet1.add(name);

        }
        System.out.println(hashSet1);
        //  third idea you can use the iterator

        // fourth idea is use constructor of set
        HashSet <String> hashset2 = new HashSet<>(names);
        System.out.println(hashset2);
        System.out.println(names); // it will print the array list that is why it will repeat the names


        //================== hash set practice
        HashSet items =new HashSet();
        items.add("microphone");
        items.add("cable");
        items.add("computer");
        List listOfItems=new ArrayList<>(items);
        System.out.println(listOfItems);

    }
}
