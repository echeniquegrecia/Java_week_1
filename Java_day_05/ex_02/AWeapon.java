public abstract class AWeapon{

    protected String name;
    protected int apcost;
    protected int damage;
    protected Boolean melee = false;


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