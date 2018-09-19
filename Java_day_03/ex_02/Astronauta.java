public class Astronauta{

    private String name;
    private int snacks;
    private String destination = null;
    private int id = 0;
    private static int count = 0;


    //Constructor
    public Astronauta(String name){
        this.name = name;
        this.id = count++;
        System.out.println(name + " ready for launch !");
    }

    public int getId(){
        return this.id;
    }

    public String getDestination(){
        return this.destination;
    }

}
