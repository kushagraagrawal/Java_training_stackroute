import java.util.Scanner;

public class NumRepeat{
    public void numrepeat(){
        Scanner input = new Scanner(System.in);

        int input_number = input.nextInt(); // Number to be taken as input

        for(int i=1;i<=input_number;i++){
            for(int j=0;j<i;j++)
                System.out.print(i + " ");      // Loop for required output
        }
    }
}
