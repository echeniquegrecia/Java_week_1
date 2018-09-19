import java.util.ArrayList;

public class Team{

    private String name;
    private int count_members = 0;
    private ArrayList<Astronauta> members =  new ArrayList<Astronauta>(); ;

    //constructor
    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Astronauta> add(Astronauta astronauta){
        members.add(astronauta);
        System.out.println(this.members);
        return this.members;
    }



    public void remove(Astronauta astronauta){
        members.remove(astronauta);
    }

    public int countMembers(){
        return members.size();

    }

    public void showMembers(){
        for (int i = 0; i <members.size(); i++ ){
            System.out.println(members.get(i).getName());
        }
    }

}