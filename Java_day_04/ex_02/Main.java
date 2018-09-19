public class Main{

    public static void main (String[] args){
        Animal isidore = new Animal ("Isidore" , 4 , Animal.MAMMAL);
        Animal billy = new Animal ("Billy" , 4 , Animal.MAMMAL);
        Animal titi = new Animal ("Titi" , 0 , Animal.FISH);
        Animal lily = new Animal ("Lily" , 4 , Animal.BIRD);
        Animal Tipi = new Animal ("Tipi" , 4 , Animal.BIRD);
        Animal mimi = new Animal ("Mimi" , 4 , Animal.BIRD);
        Animal.getNumberofAnimal();
        Animal.getNumberofMammal();
        Animal.getNumberofFish();
        Animal.getNumberofBird();
    }
}