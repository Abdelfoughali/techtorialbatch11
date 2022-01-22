package setMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice1 {
    public static void main(String[] args) {
        HashSet<String> colorsHash= new HashSet<>();
        LinkedHashSet<String> colorLinked=new LinkedHashSet<>();
        TreeSet<String> colorsTree =new TreeSet<>();
        colorsHash.add("white");           colorLinked.add("white");         colorsTree.add("white");
        colorsHash.add("Black");           colorLinked.add("Black");         colorsTree.add("Black");
        colorsHash.add("Blue");            colorLinked.add("Blue");          colorsTree.add("Blue");
        colorsHash.add("purple");          colorLinked.add("purple");        colorsTree.add("purple");
        colorsHash.add("Red");             colorLinked.add("Red");           colorsTree.add("Red");
  colorsHash.add(null);                     colorLinked.add(null);           //  colorsTree.add(null);

        System.out.println("this is the print 1 "+colorsHash);   // no order
        System.out.println("this is the print 2 "+colorLinked);   // insertion order
        System.out.println("this is the print 3 "+colorsTree);    // ascending order

        System.out.println("======"+colorsTree.descendingSet());
        Set<String> example =colorsTree.descendingSet();
        System.out.println(example);

    }
}
