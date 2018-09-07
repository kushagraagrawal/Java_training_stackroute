import java.util.Scanner;

public class TomandJerry{
    public void tomjerry(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); //num to be taken as input

        // Conditions to check if it lies in the range of 20 and 30 and if it is even or odd.

        if(num >= 20 && num <= 30){
            if(num%2==0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }
        else{
            System.out.println("error");
        }
    }
}