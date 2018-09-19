public class Mars{

    private int id = 0;
    private static int count = 0;

    //Constructor
    public Mars(){
        this.id = count++;
    }

    public int getId(){
        return this.id;
    }

}

