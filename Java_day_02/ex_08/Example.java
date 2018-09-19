public class Example{

    
    public static void main(String[] args){

        Example test = new Example();
        Gecko mimi = test.new Gecko("mimi");
        Gecko arthur = test.new Gecko("arthur");
        arthur.setEnergy(10);
        mimi.fraternize("arthur");
        Snake anaconda = test.new Snake("anaconda");

    }
   
    class Gecko{

        private String name;
        private int age;
        private float energy = 10;

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
        
        public void eat(String food){

            if(food.toLowerCase().equals("meat")){
                System.out.println("Yummy!");
                if(this.energy <= 90)
                {
                    this.energy += 10;
                }
                
                
            }
            else if(food.toLowerCase().equals("vegetable")){
                System.out.println("Erk!");
                if(this.energy >= 10)
                {
                    this.energy -= 10;
                }
                
            }
            else{
                System.out.println("I can't eat this");
            }
        }

        public void setEnergy(float energy){
            this.energy = energy;
        }

        public float getEnergy(){
            return this.energy;
        }

        public void work(){
            if(this.energy >=25){
                System.out.println("I’m working T.T");
                this.energy = this.energy / 9;
            }
            else{
                System.out.println("Heyyy I’m too sleepy , better take a nap !");
                this.energy = 50;
            }
        }

        public void fraternize(Object gecko){
        
            if(gecko instanceof Gecko){
                if (((Gecko) gecko).getEnergy() >= 30 && this.getEnergy() >= 30){
                    System.out.println("I’m going to drink with "+ ((Gecko) gecko).getName() + "!");
                    this.energy -= 30;
                    ((Gecko) gecko).setEnergy(((Gecko) gecko).getEnergy() -30);
                }
                else if (((Gecko) gecko).getEnergy() < 30 && this.getEnergy() < 30){
                    System.out.println("Not today!");

                }
                else{
                    System.out.println("Sorry "+ this.getName() +", I’m too tired to go out tonight.");
                    System.out.println("Oh ! That ’ s too bad , another time then !");
                }
            }
            else{
                System.out.println("No way");
            }

        }
    }

    class Snake{

        private String name;    

        //constructor
        public Snake(String name) {
            this.name = name;
            System.out.println("Hello " +name);
        }
    }
}
    