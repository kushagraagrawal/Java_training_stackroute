import java.util.Scanner;

public class ConsonantVowel{
    /*
    * Function to check if a character in a string is consonant or vowel
    *
    *
    * */
    public String consonantvowel(String querystring){
        Scanner input = new Scanner(System.in);
        String input_string = querystring; // String to be taken as input
        input_string = input_string.toLowerCase();
        // String to check if characters are vowel or consonant.
        String answerstring = "";

        for(int i=0;i<input_string.length();i++){
            if(Character.isLetter(input_string.charAt(i))){
                if(input_string.charAt(i) =='a' || input_string.charAt(i) =='e' ||
                        input_string.charAt(i) =='i' || input_string.charAt(i) =='o' || input_string.charAt(i) =='u'){
                    answerstring = answerstring + " Vowel";
                } else{
                    answerstring = answerstring + " Consonant";
                }
            } else{
               answerstring = answerstring + " error"; // If the character is not character, i.e. numeric or special character
            }

        }
        answerstring = answerstring.trim();
        System.out.println(answerstring);
        return answerstring;
    }
}

