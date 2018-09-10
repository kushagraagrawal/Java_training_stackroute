import java.util.Scanner;

public class Palindrome{
    public String palindrome(long num){
        //Scanner input = new Scanner(System.in);
        long inputNumber = num; // The number to be checked
        long reverse = 0; // variable to store the number
        long temp; // temporary variable to store digit
        long originalNumber = inputNumber; // to store inputNumber
        while(inputNumber!=0){
            temp = inputNumber%10;
            reverse = reverse * 10 + temp;
            inputNumber/=10;
        }
        boolean palindrome = false;
        //System.out.println(reverse);
        //System.out.println(originalNumber);//variable to check if number is palindrome
        if(reverse == originalNumber)
            palindrome = true;

        long NumberEvenSum = 0; // Sum of even digits of number
        long originalNumber2 = originalNumber; // to store the original number

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
                String answer = originalNumber2 + "is a palindrome and sum of even numbers is greater than 25";
                System.out.println(answer);
                return answer;
            }
            else{
                String answer = originalNumber2 + "is a palindrom and sum of even numbers is less than 25";
                System.out.println(answer);
                return answer;
            }
        }
        else{
            String answer = originalNumber2 + "is not a palindrome";
            System.out.println(answer);
            return answer;
        }
    }
}