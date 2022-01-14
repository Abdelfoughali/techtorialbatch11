package arrayList;

import java.util.ArrayList;

public class Practice3 {
    /*===TASK===:
        -Create an ArrayList that will store 5 fruit names
        -Print out stored values by using for Loop*/
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Watermelon");  //  for (String fruit : fruits ){   sout fruit}
        fruits.add("Kiwi");

        for (String fruit : fruits) {

            System.out.println("i am the forat print here "+fruit);
        }
        System.out.println("====This is after first for loop===");
         printFruits(fruits);
        System.out.println("====This is after  removing elements===");
        removeFruits(fruits);

    }



// create a method that will take arraylist as a a parameter of fruits
// this method will print out fruits if it has 5 or more letters
    public static void printFruits(ArrayList<String> fruits ){

        for (String fruit: fruits){
            if (fruit.length()>=5){
                System.out.println(fruit);
            }
        }
    }
    //create a method that will take arraylist as a a parameter of fruits
    // this method will remove elements that has 4 or less letters from the arraylist
    public static void removeFruits(ArrayList<String> fruits){

        for (int i =0; i< fruits.size(); i++){
            if (fruits.get(i).length()<=4){
                fruits.remove(i);
            }
        }
        System.out.println("i am the last one "+fruits);
    }

}
