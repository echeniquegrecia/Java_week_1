public class Main{

    public static void main (String[] args){
        planet.Mars titi = new planet.Mars();
        planet.Mars toto = new planet.Mars();
        
        new planet.moon.Phobos(titi);
        new planet.moon.Phobos(toto);
        new planet.moon.Phobos();
    }
}