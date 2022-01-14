package map;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap();
        map.put(1,"jafar");
        map.put(2,"ali");
        map.put(3,"billal");
        map.put(4,"jafar");

        System.out.println(map);
map.put(1,"yusuf");
        System.out.println(map);
        map.put(null,"enes");
        System.out.println(map);
        map.put(null,"divid");
        System.out.println(map);
// get()
        map.get(2);
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(null));

        //  remove ()
        map.remove(null);
        System.out.println("this is the remove1 "+map);

        System.out.println( "this is the removing of yusuf "+map.remove(1,"yusuf"));
        System.out.println(map);

        // replace
        map.replace(2,"ali","rabah");
        System.out.println(map);
        System.out.println("logically it is going to return a boolean "+map.containsKey("rabah"));
        System.out.println(map.containsKey(6));
        System.out.println(map.containsKey(19));
        System.out.println(map.containsValue("jafar"));
        System.out.println(map.containsValue(false));
        System.out.println(map.size());

        // putAll
        HashMap <Integer,String> map1 =new HashMap<>();
        map1.put(1,"white");
        System.out.println(map1);
        map1.putAll(map);
        System.out.println(map1);
        map1.put(9,"brain");
        System.out.println("the last one"+map1);

    }
}
