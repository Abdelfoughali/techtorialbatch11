package MentoringWithAhmet;

import java.util.*;

public class PracticeArrayArrayListMap {//LETS DO IT STEP BY STEP:

    public static void main(String[] args) {
        PracticeArrayArrayListMap object =new PracticeArrayArrayListMap();
        object.PrintDairy();
        object.PrintChips();
        object.PrintCookies();
        object.DairyNmaePrice();
        object.chipsNmaePrice();


    }
    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein
    String [] Dairy={"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};
    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles
    String [] Chips={"Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};
    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand
    String [] cookies ={"Nabisco","Oreo", "Nestle", "Amos", "SnackWell" ,"MaryLand"};
    //TASK 1:
    //  Create three more arrays to store the prices for these products.
    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,
    double[] dairyPrice ={ 2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,
    double[] chipsPrice ={3.99,  2.99,  4.99,  3.49,  1.99,  2.69};
    //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,
    double[] cookiesPrice ={4.99,  3.99,  5.99,  4.49,  2.99,  3.69};



    //TASK 2:
//    Create the method to print the Dairy.(do it with the list, think about the reason why )
    public void PrintDairy(){
        List<String> dairyList=new ArrayList<>();
        for (String product : Dairy){
            dairyList.add(product);
        }
        System.out.println(dairyList);
        // second way
        // List<String> shortway =new ArrayList<>(Arrays.asList(Dairy));
    }

//    Create the method to print the Chips.(do it with the list, think about the reason why )
public void PrintChips(){
    List<String> chipsList=new ArrayList<>();
    for (String product1 : Chips){
        chipsList.add(product1);
    }
    System.out.println(chipsList);}
//    Create the method to print the Cookies (do it with the list, think about the reason why )
    public void PrintCookies (){
        List<String> cookiesList=new ArrayList<>();
        for (String product2 : cookies){
            cookiesList.add(product2);
        }
        System.out.println(cookiesList);
    }
    //TASK 3:
    //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )

    public void DairyNmaePrice(){
        Map<String,Double> listOFtheDairyPrice =new HashMap<>();
        for (int i =0;i<Dairy.length;i++ ){
            listOFtheDairyPrice.put(Dairy[i],dairyPrice[i]);
        }
        System.out.println(listOFtheDairyPrice);
    }


//    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )
public void chipsNmaePrice(){
    Map<String,Double> listOFthechipsPrice =new HashMap<>();
    for (int i =0;i<Chips.length;i++ ){
        listOFthechipsPrice.put(Chips[i],chipsPrice[i]);
    }
    System.out.println(listOFthechipsPrice);
}
}
//    Create the method to print the CookiesPrice (do it with the list, think about the reason why )
    //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )
//    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )
//    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )
    //TASK 5:
    // Do all Task4 in a same method
    //TASK 6:
    //Create a method with the parameter String nameofItem and find the price of the product ?
    //Create a method with the parameter String nameofItem and remove it from the map
    //Create a method with the parameter String nameofItem and replace it with the new product

