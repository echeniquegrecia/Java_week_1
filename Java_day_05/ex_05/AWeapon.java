public abstract class AWeapon{

    protected String name;
    protected int hp = 0; //health point
    protected int ap = 0; // action points
    protected int damage = 0; //amount of damage
    protected int apcost = 0; //action point cost
    protected boolean melee = false;


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