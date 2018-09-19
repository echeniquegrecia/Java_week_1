public class Main{

    public static void main (String[] args){
        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy");
        Shark rekan = new Shark("Rekan");
        Shark arthur = new BlueShark("Arthur");
        Shark luis = new GreatWhite("Luis");
        arthur.eat(rekan);
        arthur.eat(titi);
        //luis.eat(titi);
        //luis.eat(willy);
        //luis.eat(luis);
       
        
    }
}