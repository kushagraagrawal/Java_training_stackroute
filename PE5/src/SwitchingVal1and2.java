import java.util.Map;

public class SwitchingVal1and2 {
    public Map<String, String> switchemboth(Map<String, String> val1and2){
        if(val1and2.get("val1") != null){
            val1and2.put("val2", val1and2.get("val1"));
            val1and2.put("val1", " ");
        }
        return val1and2;
    }
}
