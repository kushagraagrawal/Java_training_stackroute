public class Mood {
    public String analyzeMood(String msg){
        if(msg.contains("sad"))
            return "SAD";
        else
            return "HAPPY";

    }
}
