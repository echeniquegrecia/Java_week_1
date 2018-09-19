public class Animal{

    public static final int MAMMAL = 0;
    public static final int FISH = 1;
    public static final int BIRD = 2;

    private String name;
    private int legs;
    private int type;

    //Constructor
    public Animal(String name, int legs, int type){
        this.name = name;
        this.legs = legs;
        this.type = type;

        System.out.println("test ="+ this.type);

        System.out.println("My name is " + this.name + " and I am a " + this.getType());

    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType(){

        String status = "";

        switch(this.type){
            case 0:
                status =  "mamal";
                break;
            case 1:
                status = "fish";
                break;
            case 2:
                status = "bird";
                break;
            }

        return status;

    }
    
    public void setName(String name) {
        this.name= name;
    }

}
