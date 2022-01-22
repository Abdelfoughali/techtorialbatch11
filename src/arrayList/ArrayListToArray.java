package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList <String> names =new ArrayList<>();
        names.add("dima");
        names.add("diana");
        names.add("aizat");
        names.add("samir");

        //System.out.println(names);
        // convert this arrayLsit to array
        Object [] arrarNames = names.toArray();
        System.out.println(Arrays.toString(arrarNames));
        // the next steps try to call the flower class and print them as the array

    }
}
