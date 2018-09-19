public class PowerFirst extends AWeapon{

    public PowerFirst(){
        
        this.name = "PowerFirst";
        this.apcost = 50;
        this.damage = 8;
        this.melee = true;

    }

    public void attack(){
        System.out.println("SBAM");
    }
}