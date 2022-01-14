package accessModifiers;

public class Animal {
    public String name;
    private String color;
    protected int age;
    String breed;
    public void speakPublic(){
        System.out.println("speaking");
    }
    private void eatPrivate(){
        System.out.println("eat");
    }
    protected void runProtected(){
        System.out.println("running");
    }
    void sleepDefault(){
        System.out.println("sleepping");
    }

    public static void main(String[] args) {
        Animal animal =new Animal();
        animal.eatPrivate();
        animal.color="white";
    }
}
