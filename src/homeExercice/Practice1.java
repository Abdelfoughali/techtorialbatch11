package homeExercice;

import java.util.Arrays;

public class Practice1 {
    
    public static void main(String[] args) {

      int[] array = {1, 3, 45,4, 6, 7};
//       int [] reverse=new int[array.length];
//int j=0;
//      for(int i= array.length-1;i>=0;i--){
//              reverse[j]=array[i];
//              j++;
//      }
//        System.out.println(Arrays.toString(reverse));



        for(int i=0; i<array.length/2; i++){
            int temp = array[i];  //1
            array[i] = array[array.length -i -1]; //(0)=7
            array[array.length -i -1] = temp;  //(6)=1
        }
        System.out.println(Arrays.toString(array));



    }
}






//} System.out.println(Arrays.toString(reverse));
