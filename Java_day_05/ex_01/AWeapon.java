public abstract class AWeapon{

    private String name;
    private int apcost;
    private int damage;
    private Boolean melee;

    //Constructor
    public AWeapon(String name, int apcost, int damage){
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
    }

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