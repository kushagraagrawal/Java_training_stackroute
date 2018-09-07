import java.util.Scanner;

public class RepeatCharacters{
    public void repeatcharacters(){
        String original_string;
        int number;
        Scanner input = new Scanner(System.in);
        original_string = input.nextLine(); //Original String to be input
        number = input.nextInt(); // Number of repetitions

        int length = original_string.length(); // length of original string
        System.out.print(original_string);
        for(int i=0;i<number;i++){
            System.out.print(original_string.substring(length-number)); //repeating the last "number" of characters "number" of times.
        }
    }
}
