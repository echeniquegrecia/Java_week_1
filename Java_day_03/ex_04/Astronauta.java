public class Astronauta{

    private String name;
    private int snacks = 0;
    private String destination = null;
    private int id = 0;
    private static int count = 0;


    //Constructor
    public Astronauta(String name){
        this.name = name;
        this.id = count++;
        System.out.println(name + " ready for launch !");
        System.out.println(name + " I may have done nothing, but I have "+ this.snacks+ " Mars to eat at least !");
    }

    //Constructor
    public Astronauta(String name, String destination){
        this.name = name;
        this.destination = destination;
        this.id = count++;
        System.out.println(name + " ready for launch !");
    }


    public String getName(){
        return this.name;
    }


    public int getId(){
        return this.id;
    }

    public String getDestination(){
        return this.destination;
    }

    public int getSnacks(){
        return this.snacks;
    }

    public void doAction(){
        System.out.println(this.getName() + ": Nothing to do.");
    }


    public void doAction(planet.Mars mars){
        System.out.println(this.name + ": Started a mission!");
    }

    public void doAction(chocolate.Mars mars){
        System.out.println(this.name + " is eating mars number " + mars.getId());
        this.snacks = this.snacks++;
    }

}