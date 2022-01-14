package blocks;

public class Practice {
    String lastName;
    String name;
    static String color;


    {
        // this is an instance blocks run for evry object
        // intialize instance variable
        this.lastName ="karol";
        name ="joe";
        System.out.println(" this is instance blocks");
    }


    static {
        // static blocks run before evrything in the class   take priority
        // initialize static variables
        color ="orange";
        System.out.println("this is STATIC blocks");
    }

    public static void main(String[] args) {
Practice pr =new Practice();
        Practice pr1 =new Practice();
        Practice pr2 = new Practice();


    }
}
