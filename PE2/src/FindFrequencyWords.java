import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class FindFrequencyWords {
    static HashMap<String, Integer> map = new HashMap<>();
    public static void main(String[] args){
        try{
            FindingFrequencyOfWords("test.txt");
        }catch (Exception e){
            System.out.println(e);

        }
    }

    private static void FindingFrequencyOfWords(String filename) {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(filename));

            String line = reader.readLine();
            while (line!=null){
                String[] words = line.split(" ");
                for(int i=0;i<words.length;i++){
                    if(map.containsKey(words[i])){
                        int x = map.get(words[i]);
                        x++;
                        int oldValue = map.put(words[i], x);
                    }else{
                        map.put(words[i], 1);
                    }
                }

                //System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
            //System.out.println(map);

            for(String key: map.keySet()){
                System.out.println(key + " " + map.get(key));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
