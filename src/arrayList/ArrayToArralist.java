package arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToArralist {
    public static void main(String[] args) {
        int numbers[]={3,4,5,6};
        List <int[]> listnumbers =Arrays.asList(numbers);
        System.out.println(listnumbers); // the int is created as varriable
        Integer[] number1 ={3,4,5,6,7,8,8}; // the integer is created as object is it going to work
        List<Integer>listnuMBER1=Arrays.asList(number1);
     //   System.out.println(listnumbers);
        System.out.println(listnuMBER1);
    }
}
