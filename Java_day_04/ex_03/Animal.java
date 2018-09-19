public class Animal{

    public static final int MAMMAL = 0;
    public static final int FISH = 1;
    public static final int BIRD = 2;

    private String name;
    private int legs;
    private int type;
    private static int count_animal = 0;
    private static int count_mammal = 0;
    private static int count_fish = 0;
    private static int count_bird = 0;

    //Constructor
    public Animal(String name, int legs, int type){
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + this.name + " and I am a " + this.getType());
        count_animal++;
        if(type == 0){
            count_mammal++;
        }
        else if (type == 1){
            count_fish++;
        }
        else{
            count_bird++;
        }
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

    public static void getNumberofAnimal(){

        if(count_animal == 1){
            System.out.println("There is currently " + count_animal + " animal in our world.");
        }
        else{
            System.out.println("There are currently " + count_animal + " animals in our world.");
        }    
    }

    public static void getNumberofMammal(){

        if(count_mammal <= 1){
            System.out.println("There is currently " + count_mammal +  " mammal animal in our world.");
        }
        else{
            System.out.println("There are currently " + count_mammal + " mammals animals in our world.");
        }    
    }

    public static void getNumberofFish(){

        if(count_fish <= 1){
            System.out.println("There is currently " + count_fish + " fish animal in our world.");
        }
        else{
            System.out.println("There are currently " + count_fish + " fishes animals in our world.");
        }    
    }

    public static void getNumberofBird(){

        if(count_bird <= 1){
            System.out.println("There is currently " + count_bird + " bird animal in our world.");
        }
        else{
            System.out.println("There are currently " + count_bird + " birds animals in our world.");
        }    
    }
}
