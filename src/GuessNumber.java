import java.util.Scanner;

public class GuessNumber{
    public void guessnumber(){
        int number = 57; //Number to be guessed
        Scanner input = new Scanner(System.in);
        int guess = 0; //User guess
        while(number != guess){
            guess = input.nextInt();            //Loop for checking number
            if(guess > number){
                System.out.println("More than number");
            }
            else if(guess< number){
                System.out.println("Less than number");

            }
            else{
                System.out.println("Correct guess");
            }
        }
    }
}
