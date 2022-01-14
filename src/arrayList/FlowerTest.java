package arrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {


    Flower flower1 = new Flower("rose","red",12);
    Flower flower2 = new Flower("yellow","red",11);
    Flower flower3 = new Flower("green","red",10);


    ArrayList<Flower> flowersList =new ArrayList();
    flowersList.add(flower1);
        flowersList.add(flower2);
        flowersList.add(flower3);
        for (Flower flower:flowersList){
            System.out.println("it is the first print out "+flower.name+" "+flower.price);

        }
        System.out.println(PriceFlowers(flowersList));
        // calling PriceLower1 from the flower class
        Flower.PriceFlowers1(flowersList);
        // i can store the priceflowers1 in the double like below
        double totalPriceForFlowers= Flower.PriceFlowers1(flowersList);
        System.out.println("this is the cost calculation from the method "+totalPriceForFlowers);

    }
        // creat a method that take the arraylist as a parametr of floweras
        // this method that will return total price of the flower

        public  static double PriceFlowers(ArrayList<Flower> vase){
            double sum=0;
            for(Flower flower:vase){
                sum+=flower.price;
            }
return sum;
        }
        // i can do the ,ethod in the class
}