package map;

import java.util.*;

public class TypesOfMaps {
    // hash map LinkedHashMap TreeMap
    public static void main(String[] args) {
        HashMap<Integer,String>drinks1=new HashMap<>();
        LinkedHashMap<Integer,String> drinks2 = new LinkedHashMap<>();
        TreeMap <Integer,String> drinks3=new TreeMap<>();


        drinks1.put(9,"water");     drinks2.put(9,"water");      drinks3.put(9,"water");
        drinks1.put(7,"coke");     drinks2.put(7,"coke");      drinks3.put(7,"coke");
        drinks1.put(11,"tea");     drinks2.put(11,"tea");      drinks3.put(11,"tea");
        drinks1.put(2,"coffee");     drinks2.put(2,"coffee");      drinks3.put(2,"coffee");
        drinks1.put(5,"pepsi");     drinks2.put(5,"pepsi");      drinks3.put(5,"pepsi");
        drinks1.put(null,"aman");    drinks2.put(null,"aman");  //  drinks2.put(null,"aman");
        drinks1.put(22,null);        drinks2.put(22,null);     drinks3.put(22,null);
                                                               drinks3.put(33,null);
        System.out.println(drinks1);  // HashMap
        System.out.println(drinks2);  // LinkedHashMap
        System.out.println(drinks3); // TreeMap

        System.out.println(drinks3.get(9));  // if you want i get the water from the drinks 3
        System.out.println(drinks3.containsValue(9));

        // print out the value by using get method , crat a new method for it

// i have to call the method to run it
        System.out.println("---------------------------------------------------------------------------------");
printValues(drinks1);
        System.out.println("==========================================");  // i am printing the three treemap hashMap and the linkedMap
        printValues(drinks2);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        printValues(drinks3);
    }
    public static  void printValues(Map<Integer,String> storage){
        for(Integer drinkKeys:storage.keySet()){
            System.out.println(storage.get(drinkKeys));

        }

    }


}
