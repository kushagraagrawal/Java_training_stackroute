import java.util.Scanner;

public class SortNumber{
    public void sortnumber(){
        int digits[] = new int[10];  // Array to store count of all Digits.
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); // number in question
        int temp; // temp variable to store digit.
        while(number!=0){
            temp = number%10;
            digits[temp]++;
            number/=10;
        }
        int even_sum=0; //Storing even sum of digits
        for(int i=9;i>=0;i--){
            if(i%2==0){
                even_sum += (digits[i] * i); //Reversing number and adding even digits
                for(int j=0;j<digits[i];j++)
                    System.out.print(i);
            }
            else{
                for(int j=0;j<digits[i];j++)
                    System.out.print(i);
            }
        }
        System.out.print("\n");
        System.out.println(even_sum);
        if(even_sum > 15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
