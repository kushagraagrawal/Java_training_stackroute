import java.util.Scanner;

public class UnspecifiedSum{
    public void unspecifiedsum(){
        Scanner input = new Scanner(System.in);
        int number; // Number that is taken as a stream
        int sum_of_number=0; // Sum to be found out
        try {
            while ((number = input.nextInt()) != 0) {
                sum_of_number += number;                // If number is 0, loop breaks and prints the sum
            }
            System.out.println(sum_of_number);
        }catch (Exception e){
            System.out.println(sum_of_number);          // If string is encountered, goes to catch and prints the sum along with message
            System.out.println("string encountered");
        }
    }
}
