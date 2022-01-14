package set;

import java.util.*;

public class UniquePractice1 {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d"};
        // store these elemnts in to set
        // convert array to arraylist than arraylist to set
        List listOfLetters =Arrays.asList(letters);
        System.out.println(listOfLetters);

        TreeSet setOfLetters= new TreeSet(listOfLetters);
        setOfLetters.add("x");
        setOfLetters.add("jafar");
        System.out.println(setOfLetters);

        // second way to do it
       // Set set = new HashSet(Arrays.asList(letters));
       // System.out.println(set);

        // the next task is show the duplicate elemets

        String[] letters1 = {"a","a", "b", "c", "d","d"};// show the duplicate element by using the set
    HashSet <String> hashSet =new HashSet<>();

    ArrayList duplicateStorage= new ArrayList();
    for (String letter :letters1){

       if( !hashSet.add(letter)) { // if the hassh set not adding it means it is a duplicate
        System.out.println("this is the repeat elemt "+letter);
           duplicateStorage.add(letter);
    }
        System.out.println(hashSet);
        System.out.println(duplicateStorage);


        }


    }}


