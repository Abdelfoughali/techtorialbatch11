package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet ids =new HashSet();
        HashSet<Integer> ids1=new HashSet();
        Set<Integer> ids2=new HashSet();
        ids1.add(22);
        ids1.add(33);
        ids1.add(44);
        System.out.println(ids1);
        System.out.println(ids1.equals("22"));
        System.out.println(ids1.contains("33"));
        System.out.println(ids1.hashCode());
      //  ids1.add(null);
        System.out.println(ids1); // ypou can add only one time in the code even it is null
        ids1.add(22);  // it will not allows us to duplicate so the 22 number it will not store again

        System.out.println(ids1);
        // there is no get() method in

        // how to reach every elements
        for (Integer id :ids1){
            if (id.equals(null)){
                continue;
            }
            System.out.println(id*2);
        }

        Iterator iterator =ids1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
