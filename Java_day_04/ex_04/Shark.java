public class Shark extends Animal{

   private Boolean frenzy = false;

    public Shark(String name){
        super(name,0,Animal.FISH);
        System.out.println("A KILLER IS BON");
    }

    public void smellBlood(Boolean parameter)
    {
        this.frenzy = parameter;
    }

    public void status(){

        if(this.frenzy == true){
            System.out.println(
                this.getName() + " is smelling blood and wants to kill."
                );
        }
        else{
            System.out.println(this.getName() + " is swimming peacefully.");
        }
    }
}