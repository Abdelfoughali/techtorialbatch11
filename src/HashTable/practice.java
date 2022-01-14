package HashTable;

import java.util.Hashtable;

public class practice {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(4,"cherry");
        hashtable.put(5,"kiwi");
        hashtable.put(1,"apple");
        System.out.println(hashtable);
        System.out.println(hashtable.get(2));
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.keySet()); // return the keys
        System.out.println(hashtable.values()); // return the values
        System.out.println(hashtable.entrySet());//

        // adding null key or null value
        //hashtable.put(null,"orange");  the hash table can not store the null
        hashtable.put(3,"starawebbery");
        System.out.println(hashtable);
        Hashtable<String,String> hashtable1=new Hashtable<>();
        hashtable1.put("a","b");
        hashtable1.put("s","r");   // no order in the hashtable
        hashtable1.put("h","t");
        System.out.println(hashtable1);

    }
}
