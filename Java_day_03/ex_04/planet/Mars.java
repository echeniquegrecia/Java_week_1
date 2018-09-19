package planet;

public class Mars{

    private int id = 0;
    private static int count = 0;
    private float size;

    //Constructor
    public Mars(float size){
        this.size = size;
        this.id = count++;
    }

    //Constructor
    public Mars(){
        this.id = count++;
    }

    public int getId(){
        return this.id;
    }

    public void setSize(int size){
        this.size = size;
    }

    public float getSize(){
        return this.size;
    }

}

