public class PlasmaRifle extends AWeapon{

    public PlasmaRifle(){

        this.name = "Plasma Rifle";
        this.apcost = 5;
        this.damage = 21;
        this.melee = false;

    }

    public void attack(){
        System.out.println("PIOU");
    }
}