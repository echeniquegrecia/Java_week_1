public abstract class AWeapon{

    private String name;
    private int hp = 0; //health point
    private int ap = 0; // action points
    private int damage = 0; //amount of damage
    private int apcost = 0; //action point cost
    private boolean melee = false;


    public String getName()
	{
		return this.name;
    }
    
    public int getApcost()
	{
		return this.apcost;
    }

    public int getDamage()
	{
		return this.damage;
	}

	public Boolean getMelee()
	{
		return this.melee;
    }
    
    abstract void attack();

}