import java.util.Scanner;

public class NumRepeat{
    public String numrepeat(int number){
        //Scanner input = number;

        int input_number = number; // Number to be taken as input
        String answer="";
        if(number < 0)
            return "Null";
        for(int i=1;i<=input_number;i++){
            for(int j=0;j<i;j++)
                answer = answer + i+ " ";      // Loop for required output
        }
        answer = answer.trim();
        return answer;
    }
}
