public class Gecko{

    private String name;
    private int age;

    public static void main(String[] args){
        Gecko arthur = new Gecko("Arthur", 1);
        System.out.println(arthur.getName());
        System.out.println(arthur.getAge());
        arthur.setAge(11);
        System.out.println(arthur.getAge());
        System.out.println(arthur.status());
    }
   
    //constructor
    public Gecko() {
        this.name = "";
        System.out.println("Hello!");
    }

    //constructor
    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello "+ name+"!");
    }

    //Method to get the name
    public String getName(){
        return this.name;
    }

    //Method to get the age
    public int getAge(){
        return this.age;
    }
    
    //Method to set the age
    public void setAge(int age) {
        this.age = age;
    }

    //Method to get the Gecko's status
    public String status(){
 
        String status;

        switch(this.age){
            case 0:
                status = "Unborn Gecko";
                break;
            case 1:
            case 2:
                status = "Baby Gecko";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                status = "Adult Gecko";
                break;  
            case 11:
            case 12:
            case 13:
                status = "Old Gecko"; 
                break;  
            default:
                status ="Impossible Gecko"; 
                break;  
        }
        return status;
    }
}