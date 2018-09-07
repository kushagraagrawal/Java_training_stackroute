import java.lang.*;
import java.util.Scanner;

public class helloworld{
    static int func(int a){
        return a*2;
    }
    public static void main(String[] args){

        helloworld x = new helloworld();
        System.out.println(x.func(3));

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int age = 15;
        System.out.println("Hello World");
        System.out.println("Line 2");
        System.out.println(func(2));

        switch (age){
            case 1:
                System.out.println("you young");
                break;
            case 15:
                System.out.println("you old");
                break;
                default:
                    System.out.println("sup");
        }
    }
    int a(int b){
        return b/2;
    }
}