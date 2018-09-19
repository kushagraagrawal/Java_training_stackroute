import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingStrings {
    public List<String> findingNumberOfSubstring(String queryString, String toFind) {
        Pattern pattern = Pattern.compile(toFind);
        Matcher matcher = pattern.matcher(queryString);
        List<String> Answer = new ArrayList<>();
        boolean found = false;
        while(matcher.find()){
            Answer.add("Found at: " + matcher.start() + " - " + matcher.end());
            found = true;
        }
        if(!found){
            Answer.add("Not found");
        }
        return Answer;

    }
}
