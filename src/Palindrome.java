import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt(); // The number to be checked
        int reverse = 0; // variable to store the number
        int temp; // temporary variable to store digit
        int originalNumber = inputNumber; // to store inputNumber
        while(inputNumber!=0){
            temp = inputNumber%10;
            reverse = reverse * 10 + temp;
            inputNumber/=10;
        }
        boolean palindrome = false; //variable to check if number is palindrome
        if(reverse == inputNumber);
        palindrome = true;

        int NumberEvenSum = 0; // Sum of even digits of number
        int originalNumber2 = originalNumber; // to store the original number

        // Loop to store sum of even digits
        while(originalNumber!=0){
            temp = originalNumber%10;
            if (temp%2 == 0)
                NumberEvenSum += temp;
            originalNumber/=10;
        }
        boolean greaterthan25 = false;
        if(NumberEvenSum > 25)
            greaterthan25 = true;

        if(palindrome == true){
            if(greaterthan25 == true){
                System.out.println(originalNumber2 + "is a palindrome and sum of even numbers is greater than 25");
            }
            else{
                System.out.println(originalNumber2 + "is a palindrom and sum of even numbers is less than 25");
            }
        }
        else{
            System.out.println(originalNumber2 + "is not a palindrome");
        }
    }
}