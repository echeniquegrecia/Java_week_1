public class Main{

    public static void main (String[] args){
        IUnit rekan_power = new ASpaceMarine("Rekan Power", 10, 10);
        IUnit monster_2000 = new AMonster("Monster_2000", 2, 1, 1, 1);
        PlasmaRifle weapon2 = new PlasmaRifle();
        PowerFirst weapon1 = new PowerFirst();

        rekan_power.attack(monster_2000);
        rekan_power.moveCloseTo(monster_2000);
        rekan_power.equip(weapon2);
        System.out.println(((AMonster) monster_2000).getName() + ": " + ((AMonster) monster_2000).getHp());
        rekan_power.attack(monster_2000);
        System.out.println(((AMonster) monster_2000).getName() + ": " + ((AMonster) monster_2000).getHp());
        // rekan_power.moveCloseTo(monster_2000);
        // rekan_power.attack(monster_2000);
        // rekan_power.attack(monster_2000);
        // rekan_power.attack(monster_2000);

        
    }
}