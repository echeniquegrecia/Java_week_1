public class ASpaceMarine implements IUnit{

    private String name;
    private int hp = 0;
    private int ap = 0;
    private AWeapon weapon;
    private boolean has_equip = false;
    private boolean melee = false;


    public ASpaceMarine(String name, int hp, int ap)
    {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        System.out.println("Hello, I am " + this.name);
       
    }

    public String getName()
    {
        return this.name;
    }

    public int getHp()
	{
		return this.hp;
    }
    
    public int getAp()
	{
		return this.ap;
    }

    public AWeapon getWeapon()
	{
		return this.weapon;
    }
    
    
    public void equip(AWeapon weapon){

        this.weapon = weapon;

        if(weapon instanceof PlasmaRifle){
            has_equip = true;
            System.out.println(this.name + " has been equipped with a " + ((AWeapon) weapon).getName());
        }
        else{
            has_equip = true;
            System.out.println(this.name + " has been equipped with a " + ((AWeapon) weapon).getName());
        }

    }

    
    public void moveCloseTo(IUnit monster){
        this.melee = true;
        System.out.println(this.getName() + " is moving closer to " + ((AMonster) monster).getName());
    }

    public void attack(IUnit monster){
        if(this.has_equip == false){
            System.out.println(this.name + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
        }
        else{
            if(this.melee == false){
                System.out.println(this.getName() + ": I'm too far away from "+  ((AMonster) monster).getName());
            }
            else{
                System.out.println(this.getName() + " attacks "+  ((AMonster) monster).getName() + " with a " + this.weapon.getName());
                ((AMonster) monster).receiveDammage(this.weapon.getDamage());
            }
        }
    }

    public void receiveDammage(int damage)
    {
        if(this.hp > 0){
            this.hp -= damage;
        }
        else{
            System.out.println("Game over, "+ this.name + " is DEAD");
        }
    }

    public void recoverAP(){
        if(this.ap > 50){
            this.ap = 50;
        }
        else{
            this.ap = this.ap-9;
        }
    }

}