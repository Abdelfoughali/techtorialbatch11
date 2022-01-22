package setMap;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet <Integer> zipCodes=new TreeSet<>();
        zipCodes.add(45);
        zipCodes.add(12);
        zipCodes.add(98);
        zipCodes.add(51);
        // the first
        System.out.println(zipCodes.first());
        // last
        System.out.println(zipCodes.last());
        // pollfirst()

        System.out.println(zipCodes.pollFirst());
        System.out.println(zipCodes);

        // pollLast
        zipCodes.pollFirst();
        System.out.println(zipCodes);
// descending

        System.out.println(zipCodes.descendingSet());


    }
}
