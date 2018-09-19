import java.util.ArrayList;

public class Ex_05{

    public static void main(String[] args){
        System.out.print(myGetArgs("hello", "holaaaaa", "bonjour", "Super!"));
    }

    public static ArrayList<String> myGetArgs(String... var){
        ArrayList<String> items = new ArrayList<String>(var.length);
        for(int i = 0; i < var.length; i++){
            items.add(var[i]); 
        }
    return items;
    }   
}