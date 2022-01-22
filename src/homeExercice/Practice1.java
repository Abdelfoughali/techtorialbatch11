package homeExercice;

import java.util.Arrays;

public class Practice1 {
//static String string;
//static String str;
    public static void main(String[] args) {

       Practice1 practice1= new Practice1();
       practice1.StringReverse("JAFAR","");
      int[] array = {1, 3, 45,4, 6, 7};
       int [] reverse=new int[array.length];


       ArrayReverse(array,reverse);
//int j=0;
//      for(int i= array.length-1;i>=0;i--){
//              reverse[j]=array[i];
//              j++;
//      }
//        System.out.println(Arrays.toString(reverse));
//
//
//
//        for(int i=0; i<array.length/2; i++){
//            int temp = array[i];  //1
//            array[i] = array[array.length -i -1]; //(0)=7
//            array[array.length -i -1] = temp;  //(6)=1
//        }
//        System.out.println(Arrays.toString(array));



    }

    public  void StringReverse(String string,String str){

        for (int i =string.length()-1 ;i>=0;i--){
            str+=string.charAt(i);
        }
        System.out.println(str);
    }
    public static void ArrayReverse(int[] array,int [] reverse){int j=0;
        for(int i= array.length-1;i>=0;i--){
            reverse[j]=array[i];
            j++;
        }
        System.out.println("this is for the reverse method "+Arrays.toString(reverse));

    }
}
// reverse string by using methods







