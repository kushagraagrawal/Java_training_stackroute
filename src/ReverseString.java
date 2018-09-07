import java.util.Scanner;

public class ReverseString{
    public void reversestring(){
        Scanner input = new Scanner(System.in);
        String originalstring = input.nextLine(); //Originial String
        int n = originalstring.length(); //Length of the string
        for(int i=n-1;i>=0;i--){
            System.out.print(originalstring.charAt(i)); //Reversing the string
        }
    }
}
