public class BlueShark extends Shark{

    public BlueShark(String name){
        super(name);
    }

    public void eat(Animal food) throws NullPointerException{

        if(((Animal) food).getType().equals("fish")){
            super.eat(food);
        }
        else{
            System.out.println(this.getName() + ": it's not worth my time");
        }
    }
}