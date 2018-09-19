public class GreatWhite extends Shark{

    public GreatWhite(String name){
        super(name);
    }

    public void eat(Animal food){

        if(food instanceof Canary){
            System.out.println(this.getName() + ": Next time you try to give me that to eat, I 'll eat you instead'");
        }
        else{
            super.eat(food);
        }
    }
    
}