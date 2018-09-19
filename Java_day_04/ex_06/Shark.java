public class Shark extends Animal{

   private Boolean frenzy = false;
   private static int count = 0;
   private int id = 0;

    public Shark(String name){
        super(name,0,Animal.FISH);
        System.out.println("A KILLER IS BON");
        this.id = count++;

    }

    public void smellBlood(Boolean parameter)
    {
        this.frenzy = parameter;
    }

    public void status(){

        if(this.frenzy == true){
            System.out.println(this.getName() + " is smelling blood and wants to kill.");
        }
        else{
            System.out.println(this.getName() + " is swimming peacefully.");
        }
    }

    public int getId(){
        return this.id;
    }

    public void eat(Animal food){
        if(food instanceof Shark){
            if(((Shark) food).getId() == this.getId()){
                System.out.println(this.getName() + ": it's not worth my time");
            }
            else{
                System.out.println(this.getName() + " ate a " + food.getType() + " named " + food.getName());
                if(this.frenzy == true){
                    this.frenzy = false;
                }
            } 
        }
        else{
            System.out.println(this.getName() + " ate a " + food.getType() + " named " + food.getName());
            if(this.frenzy == true){
                this.frenzy = false;
            }
        }
    }    
}