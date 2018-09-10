import java.util.Scanner;

public class RecognizeChar{
    public String recognizecharacter(char tobetested){
        Scanner input = new Scanner(System.in);
        char ch = tobetested;
        String answer = "";// Character to be tested with multiple cases
        if(Character.isUpperCase(ch)){
            System.out.println("upper case");
            answer = "upper case";
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("lower case");
            answer = "lower case";
        }
        else if(Character.isDigit(ch)){
            System.out.println("Digit");
            answer = "Digit";
        }
        else {
            System.out.println("Special Symbol");
            answer = "Special Symbol";
        }
        return answer;
    }
}
