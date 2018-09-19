public class Ex_02{
    public static void main(String[] args){
        String reponse_dog = getAngryDog(3);
        System.out.print(reponse_dog);
    }

    public static String getAngryDog(int nbr){
        String result = "";
        for(int i = 0; i < nbr; i++){
            result = result + "woof";
        }
    return result;
    }
}