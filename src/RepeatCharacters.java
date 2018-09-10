import java.util.Scanner;

public class RepeatCharacters{
    public static String Repeatchar(String str, int x) {

        String answer;
            /*String str;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a String:");
            str = s.nextLine();
            System.out.print("Enter a number");
            int x = s.nextInt();*/
        try {
            answer = "";
            int len = str.length();
            answer = str;
            //System.out.print(str.charAt(i));

            for (int i = 0; i < x; i++) {
                for (int j = len - x; j < len; j++)
                    answer = answer + str.charAt(j);
            }
        }catch (Exception e){answer = "ERROR";};
        return answer;
    }

}
