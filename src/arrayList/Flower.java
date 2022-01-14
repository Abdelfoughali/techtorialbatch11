package arrayList;

import java.util.ArrayList;

public class Flower {
    // create a flower class create few varriable which includes color name price
    // initialize the instance variable
    // create a FlowerTest class
    // creat a few flower object and store them in the arraylist
    // print out prices of each flower
    String name;
    String color;
    int price;
    public Flower(String name,String color,int price){
        this.name=name;
        this.color=color;
        this.price=price;
    }
    public  static double PriceFlowers1(ArrayList<Flower> vase){
        double sum=0;
        for(Flower flower:vase){
            sum+=flower.price;
        }
        return sum;
    }
}
