package map;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String [] Drinks={"coke","water","coke","coffee","ayran","water"};
        // you want to store these drinks into the map with the amount
        // that how many times that you see them in the array
        HashMap<String,Integer> task=new HashMap<>();
        for (String drink :Drinks){
            if (!task.containsKey(drink)){
                task.put(drink,1);
            }else {
                task.put(drink,task.get(drink)+1);
            }
        }
        System.out.println(task);


    }
}
