import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounts {
    public Map<String, Integer> getCount(String queryString) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(queryString);


        Map<String, Integer> answer = new HashMap<>();
        while(matcher.find()){
            try {
                answer.put(matcher.group(), answer.get(matcher.group()) + 1);
            }catch (NullPointerException e){
                answer.put(matcher.group(), 1);
            }

        }

        return answer;
    }
}
