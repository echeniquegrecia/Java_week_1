public class Main{

    public static void main (String[] args){

        //name
        //hp
        //ap
        //damage
        //apcost

        IUnit hulk = new AMonster("Hulk", 10, 10, 3, 2);
        IUnit marine = new ASpaceMarine("Marine", 2, 1, 1, 1);


        System.out.println(((AMonster) hulk).getAp());
        System.out.println(((AMonster) hulk).getHp());
        hulk.attack(marine);
        hulk.moveCloseTo(marine);
        hulk.attack(marine);
        hulk.attack(marine);
        hulk.attack(marine);
        System.out.println(((AMonster) hulk).getAp());
        hulk.recoverAP();
        System.out.println(((AMonster) hulk).getAp());


        // IUnit rekan_power = new ASpaceMarine("Rekan_power", 10, 10, 3, 2);
        // IUnit monster_2000 = new AMonster("Monster_2000", 2, 1, 1, 1);
        // rekan_power.attack(monster_2000);
        // rekan_power.moveCloseTo(monster_2000);
        // rekan_power.attack(monster_2000);
        // rekan_power.attack(monster_2000);
        // rekan_power.attack(monster_2000);

        
    }
}