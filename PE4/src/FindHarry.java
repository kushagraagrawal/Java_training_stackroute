import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHarry {
    public String findHarry(String queryString) {

        Pattern pattern = Pattern.compile("(?:^|\\W)Harry(?:$|\\W)");
        Matcher matcher = pattern.matcher(queryString);

        boolean found = false;
        while (matcher.find()){
            found = true;
        }
        if(found == true)
            return "true";
        return "false";
    }
}
