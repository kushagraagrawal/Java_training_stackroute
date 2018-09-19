import java.util.regex.Pattern;

public class TransposeString {
    public String findTranspose(String queryString) {

        if(queryString.length() == 0) {
            return null;
        }

        Pattern pattern = Pattern.compile("\\s");
        String[] words = pattern.split(queryString);
        String result = "";


        for(int i=0;i<words.length;i++){
            StringBuffer x = new StringBuffer(words[i]);
            x.reverse();
            result = result + " " + x.toString();
        }

        result = result.trim();
        return result;

    }
}
