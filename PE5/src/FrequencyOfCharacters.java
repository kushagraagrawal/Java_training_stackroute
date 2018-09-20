import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfCharacters {
    public Map<String, Boolean> findFrequency(String[] queryChars) {
        Map<String, Integer> tempMap = new HashMap<>();
        for(int i=0;i<queryChars.length;i++){
            try {
                tempMap.put(queryChars[i], tempMap.get(queryChars[i]) + 1);
            }catch (NullPointerException e){
                tempMap.put(queryChars[i], 1);
            }
        }

        Map<String, Boolean> AnswerMap = new HashMap<>();
        for(Map.Entry<String, Integer> e : tempMap.entrySet()){
            if(e.getValue() >= 2)
                AnswerMap.put(e.getKey(), true);
            else
                AnswerMap.put(e.getKey(), false);
        }
        return AnswerMap;
    }
}
