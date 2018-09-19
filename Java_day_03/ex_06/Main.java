public class Main{

    public static void main (String[] args){
        Astronauta mutta = new Astronauta ("Mutta");
        Astronauta hibito = new Astronauta ("Hibito");
        Astronauta serika = new Astronauta ("Serika");
        Team spaceBro = new Team("SpaceBrothers");
        spaceBro.add(mutta);
        spaceBro.add(hibito);
        spaceBro.add(serika);
        //spaceBro.add(3);
        System.out.println(spaceBro.countMembers());
        spaceBro.remove(hibito);
        System.out.println(spaceBro.countMembers());
        //planet.Mars titi = new planet.Mars();
        //mutta.doActions(titi);
        spaceBro.showMembers( );
        //spaceBro.remove(hibito);
        //System.out.println(spaceBro.countMembers());
    }
}