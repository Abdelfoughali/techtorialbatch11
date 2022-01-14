package map;

import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {
        String string ="Ping Pong";

        /* take every character as a key and store it value
        P, 1

         */
        string=string.replace(" ",""); // get off the space
        System.out.println(string);
        HashMap<Character,Integer> LetterCount=new HashMap<>();
        for (int i =0;i<string.length();i++){
          if (!LetterCount.containsKey(string.charAt(i))){
              LetterCount.put(string.charAt(i),1);
          }else {
              LetterCount.put(string.charAt(i),LetterCount.get(string.charAt(i))+1);
          }

        }
        System.out.println(LetterCount);
    }
}
