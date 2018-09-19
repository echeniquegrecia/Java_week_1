public interface IUnit{

    public void equip(AWeapon parameter);
    public void attack(IUnit parameter);
    public void receiveDammage(int parameter);
    public void moveCloseTo(IUnit parameter);
    public void recoverAP();
    
}