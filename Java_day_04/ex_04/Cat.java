public class Cat extends Animal{

    private String color;

    public Cat(String name){
        super(name,4,Animal.MAMMAL);
        System.out.println(this.getName() + ": MEEEOOWWWW");
    }

    public Cat(String name, String color){
        super(name,4,Animal.MAMMAL);
        this.color = color;
        System.out.println(this.getName() + ": MEEEOOWWWW");
    }

    public void meow(){
        System.out.println(this.getName() + " the " + this.color + " kitty " + "is meowing.");
    }
}