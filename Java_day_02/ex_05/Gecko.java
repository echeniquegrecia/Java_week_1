public class Gecko{

    private String name;
    private int age;

    public static void main(String[] args){
        Gecko mimi = new Gecko("mimi");
        mimi.hello("Titi");
        mimi.hello(2);
        Gecko arthur = new Gecko();
        arthur.hello("Toto");
        arthur.hello(3);
    }
   
    //constructor
    public Gecko() {
        this.name = null;
        System.out.println("Hello!");
    }

    //constructor
    public Gecko(String name) {
        this.name = name;
        //this.age = age;
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

    public void hello(Object parameter){

        if(this.name != null){
            if( parameter instanceof String){
                System.out.println("Hello " + parameter + ", I am " + this.name + "!");
            }
            else{
                for (int i =0; i < (int) parameter; i++){
                    System.out.println("Hello, I am " + this.name+ "!");
                }
            }
        }
        else{
            if( parameter instanceof String){
                System.out.println("Hello "+ parameter);
            }
            else{
                for (int i =0; i < (int) parameter; i++){
                    System.out.println("Hello!");
                }
            }
        }   
    }    
}