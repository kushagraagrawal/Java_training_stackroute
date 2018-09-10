import java.util.Scanner;

public class SortNumber{
    public String sortnumber(int numbertosort){
        int digits[] = new int[10];  // Array to store count of all Digits.
        //Scanner input = new Scanner(System.in);
        int number = numbertosort; // number in question
        int temp; // temp variable to store digit.
        while(number!=0){
            temp = number%10;
            digits[temp]++;
            number/=10;
        }
        String answer="";
        int even_sum=0; //Storing even sum of digits
        for(int i=9;i>=0;i--){
            if(i%2==0){
                even_sum += (digits[i] * i); //Reversing number and adding even digits
                for(int j=0;j<digits[i];j++)
                    answer += i;
            }
            else{
                for(int j=0;j<digits[i];j++)
                    answer += i;
            }
        }
        answer += " ";
        answer += even_sum;
        if(even_sum > 15)
            answer += " True";
        else
            answer += " False";

        System.out.println(answer);
        return answer;
    }
}
