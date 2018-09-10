import java.util.Scanner;

public class TomandJerry{
    public String tomjerry(int number){
        //Scanner input = new Scanner(System.in);
        int num = number; //num to be taken as input

        // Conditions to check if it lies in the range of 20 and 30 and if it is even or odd.
        String answer="";
        if(num >= 20 && num <= 30){
            if(num%2==0)
                answer = "Jerry";
            else
                answer = "Tom";
        }
        else{
            answer = "error";
        }
        return answer;
    }
}