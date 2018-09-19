public class Main{

    public static void main (String[] args){
        Cat isidore = new Cat("Isidore", "Orange");
        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType());
        isidore.meow();
    }
}