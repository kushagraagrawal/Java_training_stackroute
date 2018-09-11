import java.util.Scanner;

public class ReverseString{
    public String reversestring(String inputstring){
        //Scanner input = new Scanner(System.in);
        String originalstring = inputstring; //Originial String
        int n = originalstring.length(); //Length of the string
        String answer="";

        for(int i=n-1;i>=0;i--){
            System.out.print(originalstring.charAt(i));
            answer += originalstring.charAt(i) + " ";//Reversing the string
        }
        answer = answer.trim();
        return answer;
    }
}
