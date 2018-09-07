import java.util.Scanner;

public class RecognizeChar{
    public void recognizecharacter(){
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0); // Character to be tested with multiple cases
        if(Character.isUpperCase(ch)){
            System.out.println("upper case");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("lower case");
        }
        else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Symbol");
        }
    }
}
