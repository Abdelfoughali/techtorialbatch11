package map;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer ,String> cookies =new HashMap<>();
        cookies.put(3,"chocolate");
        cookies.put(8,"chocolate");
        cookies.put(5,"chocolate");
        PrintKeysOneByOne(cookies);
        PrintValueOneByOne(cookies);

    }
    // creat a method that will take a map<Integer, String > as a parsameter
    // and will print out the keys from the map one by one
    // the second question print out the values  from the map one by one

     public static void PrintKeysOneByOne(HashMap<Integer, String> map){

        map.keySet();
        for (Integer key: map.keySet()){
            System.out.println(key);
        }


     }
    public static void PrintValueOneByOne(HashMap<Integer, String> map){

        map.values();
        for (String value: map.values()){
            System.out.println(value);
        }


    }

}
