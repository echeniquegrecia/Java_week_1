public class Ex_06{

    public static void main(String[] args){
        String num = "1"; 

        int number_argument = Integer.valueOf(args[0]);

	    for (int i=0; i <= number_argument ;i++) {
		    System.out.println(num);
		    num = sequence(num);             
	    }
    }

    public static String sequence(String number){
        StringBuilder result = new StringBuilder();

        char repeat = number.charAt(0);
        number = number.substring(1)+" ";
        int times=1;

        for (char item:number.toCharArray()){
            if(item != repeat){
                result.append(times + "" + repeat);
                times = 1;
                repeat = item;
            }
            else{
                times+=1;
            }
        }
        return result.toString();
    }   
}