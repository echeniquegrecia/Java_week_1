public class Ex_03{

    public static void main(String[] args){
        printArray(new String[] {"hello", "hola", "bonjour"});
    }

    public static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}