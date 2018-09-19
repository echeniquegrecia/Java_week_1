public class Main{

    public static void main (String[] args){
        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy");
        willy.status();
        willy.smellBlood(true);
        willy.status();
        titi.layEgg();
        System.out.println(titi.getEggsCount());
       
    }
}