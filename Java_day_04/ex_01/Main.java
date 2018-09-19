public class Main{

    public static void main (String[] args){
        Animal isidore = new Animal ("Isidore" , 4 , Animal.MAMMAL);
        System.out.println(Animal.MAMMAL);
        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs ans is a " + isidore.getType());
        
    }
}