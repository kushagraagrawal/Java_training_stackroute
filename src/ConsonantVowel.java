import java.util.Scanner;

public class ConsonantVowel{
    public void consonantvowel(){
        Scanner input = new Scanner(System.in);
        String input_string = input.nextLine(); // String to be taken as input

        // String to check if characters are vowel or consonant.

        for(int i=0;i<input_string.length();i++){
            if(Character.isLetter(input_string.charAt(i))){
                if(input_string.charAt(i) =='a' || input_string.charAt(i) =='e' ||
                        input_string.charAt(i) =='i' || input_string.charAt(i) =='o' || input_string.charAt(i) =='u'){
                    System.out.print("Vowel ");
                }
                else{
                    System.out.print("Consonant ");
                }
            }
            else{
                System.out.println("error"); // If the character is not character, i.e. numeric or special character
            }

        }
    }
}

