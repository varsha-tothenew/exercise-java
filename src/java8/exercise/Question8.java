package java8.exercise;

//8.Implement multiple inheritance with default method inside  interface.

interface Mammal{
    void legs();
    default void mammalFeatures(){
        System.out.println("Mammals have mammary glands");
        System.out.println("Mammals are endothermic vertebrates.");
    }
    default void display(){
        System.out.println("mammals");
    }
}
interface Marine{
    void legs();
    default void marineFeatures(){
        System.out.println("Live in water");
        System.out.println("Can swim");
    }
    default void display(){
        System.out.println("marine animals");
    }
}
class Whale implements Mammal,Marine{
    @Override
    public void legs() {
        System.out.println("Whales dont have legs");
    }
    //Error:(25, 1) java: class java8.exercise.Whale inherits unrelated defaults for display() from types java8.exercise.Mammal and java8.exercise.Marine
    //thus we need to override method display

    @Override
    public void display() {
        System.out.println("Whales are marine mammals \n");
    }
}

public class Question8 {
    public static void main(String[] args) {
        Whale whale=new Whale();
        whale.display();
        whale.legs();
        whale.mammalFeatures();
        whale.marineFeatures();
    }
}
