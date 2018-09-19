public class AMonster implements IUnit{

    private String name;
    private int hp = 0; //health point
    private int ap = 0; // action points
    private int damage = 0; //amount of damage
    private int apcost = 0; //action point cost
    private boolean melee = false;


    public AMonster(String name, int hp, int ap, int damage, int apcost)
    {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.damage = damage;
        this.apcost = apcost;
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
    
    public int getDamage()
	{
		return this.damage;
    }
    
    public void equip(AWeapon parameter){
        System.out.println("Monsters are proud and fight with their own bodies.");
    }

    
    public void moveCloseTo(IUnit monster){
        this.melee = true;
        System.out.println(this.getName() + " is moving closer to " + ((ASpaceMarine) monster).getName());
    }

    public void attack(IUnit monster){
        if(this.melee == false){
            System.out.println(this.getName() + ": I'm too far away from "+  ((ASpaceMarine) monster).getName());
        }
        else{
            if(this.ap > this.apcost){
                this.ap -= this.apcost;
                System.out.println(this.getName() + " attacks " +  ((ASpaceMarine) monster).getName());
                ((ASpaceMarine) monster).receiveDammage(this.damage);
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
            this.ap = this.ap+7;
        }
        
    }



}