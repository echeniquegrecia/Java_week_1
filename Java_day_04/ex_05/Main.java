public class Main{

    public static void main (String[] args){
        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy");
        Shark rekan = new Shark("Rekan");
        Shark ff = new Shark("ff");
        willy.status();
        willy.smellBlood(true);
        willy.status();
        titi.layEgg();
        System.out.println(titi.getEggsCount());
        willy.eat(titi);
        willy.eat(willy);
        willy.eat(rekan);
        //willy.eat(willy);
        //willy.eat(rekan);
        
    }
}