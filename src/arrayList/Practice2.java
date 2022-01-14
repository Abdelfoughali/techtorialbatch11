package arrayList;

import java.util.ArrayList;

public class Practice2 {

    public static void main(String[] args) {

        ArrayList <String> cities = new ArrayList<>(); // ArrayList <String> cities =new ArrayList<>();

        cities.add("Chicago");                    // cities.add("chicago");
        cities.add("Chicago");
        cities.add(1,"Boston");    // cities.add(index 1, "boston ")

        System.out.println(cities.get(1));
        System.out.println(cities);
                                                   // remove it is going to remove the first element
        cities.remove("Chicago");
        System.out.println(cities);

        cities.remove("Chicago");
        System.out.println(cities);


        ArrayList <String> shoes = new ArrayList<>();
        shoes.add("Nike");
        shoes.add("Adidas");

        shoes.addAll(cities);
        System.out.println(shoes);

        shoes.remove("Boston");  // it remove from the shoes not from the cities
        System.out.println(shoes);
        System.out.println(cities);

        shoes.removeAll(cities);
        System.out.println(shoes);

        shoes.remove(1);
        System.out.println("what is this "+shoes);

        shoes.addAll(0,cities);
        System.out.println(shoes);

        ArrayList <String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Giraffe");

        // set(); --> replace
        System.out.println(animals);
        animals.set(1,"Fox");
        System.out.println(animals);





    }
}
