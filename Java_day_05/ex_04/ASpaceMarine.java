public class ASpaceMarine implements IUnit{

    private String name;
    private int hp = 0;
    private int ap = 0;
    private int damage = 0;
    private int apcost = 0;
    private boolean melee = false;

    public ASpaceMarine(String name, int hp, int ap, int damage, int apcost)
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
    
    public void equip(AWeapon parameter){
        System.out.println("Monsters are proud and fight with their own bodies.");
    }

    
    public void moveCloseTo(IUnit monster){
        this.melee = true;
        System.out.println(this.getName() + " is moving closer to " + ((AMonster) monster).getName());
    }

    public void attack(IUnit monster){
        if(this.melee == false){
            System.out.println(this.getName() + ": I'm too far away from "+  ((AMonster) monster).getName());
        }
        else{
            if(this.ap > this.apcost){
                this.ap -= this.apcost;
                System.out.println(this.getName() + " attacks " +  ((AMonster) monster).getName());
                ((AMonster) monster).receiveDammage(this.damage);
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
        System.out.println("testing");
    }

}