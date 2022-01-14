package map;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        HashMap <String,String> CityZips = new HashMap<>();

        // key set methods it will return the set object which contains all the keys in the map
// we use the get method th see the values   get("Addison")-----> 6004
            CityZips.put("chicago","60171");
        CityZips.put("Des Plaines","6002");
        CityZips.put("lake forest","6003");
        CityZips.put("addison","6004");
        System.out.println(CityZips);
        //System.out.println(CityZips.keySet());

        Set <String>cityNames =CityZips.keySet();
        System.out.println(cityNames);


        // print out alll the value from the map by using keyset that we stroed in the above

        for (String name : cityNames){
            System.out.println(CityZips.get(name));
        }
// if you use the value method it will bring the values
        CityZips.values();
        System.out.println(CityZips.values());
        Collection values =CityZips.values();
        System.out.println(values);

        // entrySet

        System.out.println("this is the entry set method with square bracket "+CityZips.entrySet());

        Set entries = CityZips.entrySet();
        System.out.println(entries);
        Set <Map.Entry<String,String>> entries1 =CityZips.entrySet();
        System.out.println(entries);
    }
}
