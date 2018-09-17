import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveVowels {
    public String[] removevowels(String[] locations) {

        List<String> StringsWithoutVowels = new ArrayList<>();

        for (int i=0;i<locations.length;i++){
            String removevowels = toRemoveVowels(locations[i]);
            StringsWithoutVowels.add(removevowels);
        }
        String[] finalAnswer = StringsWithoutVowels.toArray(new String[StringsWithoutVowels.size()]);
        return finalAnswer;
    }

    private String toRemoveVowels(String location) {
        Character vowels[] = {'a', 'e', 'i','o','u'};
        List<Character> al = Arrays.asList(vowels);
        StringBuffer sb = new StringBuffer(location);
        for(int i=0;i<sb.length();i++){
            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "");
                i--;
            }
        }
        return sb.toString();
    }
}
