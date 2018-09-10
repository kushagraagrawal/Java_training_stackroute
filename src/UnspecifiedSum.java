import java.util.Scanner;

public class UnspecifiedSum{
    public static int Sumofunspecified(String str) {
/*
            String str;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            str = s.nextLine();
*/
        int len = str.length();
        int sum = 0;
        String[] arrOfStr = str.split(" ");
        try {
            for (String b : arrOfStr) {
                int result = Integer.parseInt(b);
                sum = sum + result;
            }
        } catch (Exception e) {
            System.out.print("Enter only Integers");
        }

        return sum;
    }
}
